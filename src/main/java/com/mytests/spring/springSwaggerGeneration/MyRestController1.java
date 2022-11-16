package com.mytests.spring.springSwaggerGeneration;

import org.springframework.web.bind.annotation.*;

/**
 * *
 * <p>Created by irina on 11/16/2022.</p>
 * <p>Project: spring-swagger-generation</p>
 * *
 */
@RequestMapping("/rest1")
@RestController
public class MyRestController1 {

    @GetMapping
    public String home() { return "home";}
    @PostMapping
    public String homePost(String p) { return "home";}
    @RequestMapping("/test")
    public String test() { return "test "; }
}
