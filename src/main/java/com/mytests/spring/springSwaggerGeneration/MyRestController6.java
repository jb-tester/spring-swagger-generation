package com.mytests.spring.springSwaggerGeneration;

import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 9/27/2022.</p>
 * <p>Project: spring-swagger-generation</p>
 * *
 */
@RestController
public class MyRestController6 implements Controller6MappingsAPI {
    @Override
    public String m1(String pv) {
        return "m1 "+pv;
    }

    @Override
    public void m2(MyPojo pojo) {

    }
}
