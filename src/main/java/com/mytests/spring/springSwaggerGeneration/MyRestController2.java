package com.mytests.spring.springSwaggerGeneration;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * *
 * <p>Created by irina on 08.04.2021.</p>
 * <p>Project: spring-requestparameters</p>
 * *
 */
@RestController
@RequestMapping("/rest2")
public class MyRestController2 {
    @GetMapping("/cook")
    public String setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("coocoo", "dummy");
        response.addCookie(cookie);
        return "cookie set!";
    } 
    
    // OpenAPI for @CookieValue if #defaultValue is set:
   @GetMapping("/p1")
   public String p1(@CookieValue(name = "coocoo", defaultValue = "foo") String mycookie){
       return "p1 "+mycookie;
   } 
   
   @GetMapping("/p2/{pvar1}-{pvar2}/{pvar3}{pvar4}")
    public String p2(@PathVariable(name = "pvar1") String pv1, @PathVariable String pvar2, @PathVariable String pvar3, @PathVariable String pvar4){
        return "p2";
   }

    @GetMapping("/p3/{pvar11}/{pavr22}")
    public String p3(@PathVariable(name = "pvar11", required = false) String pv1, @PathVariable String pavr22){
        return "p2";
    }

    @RequestMapping(value = "/p4/{mv1}/{mv2}", method = RequestMethod.GET)
    public String p4(@MatrixVariable Integer mv1, @MatrixVariable(pathVar = "mv2", required = false) Integer mv2p ) {
        return "p4";
    }
}
