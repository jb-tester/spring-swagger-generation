package com.mytests.spring.springSwaggerGeneration;

import org.springframework.web.bind.annotation.*;

/**
 * *
 * <p>Created by irina on 9/27/2022.</p>
 * <p>Project: spring-swagger-generation</p>
 * *
 */
@RequestMapping("/rest6")
public interface Controller6MappingsAPI {

    @GetMapping("/m1/{pv}")
    String m1(@PathVariable String pv);

    @PostMapping(path= "/m2", consumes = "text/json")
    void m2(@RequestBody MyPojo pojo);
}
