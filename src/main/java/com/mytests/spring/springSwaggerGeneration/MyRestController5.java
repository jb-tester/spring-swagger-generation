package com.mytests.spring.springSwaggerGeneration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 9/20/2022.</p>
 * <p>Project: spring-swagger-generation</p>
 * *
 */
@RestController
@RequestMapping("/rest5")
public class MyRestController5 {

    // check OpenAPI generation via inlay
    @GetMapping("/foo")
    public String foo(){
        return "foo";
    }
}
