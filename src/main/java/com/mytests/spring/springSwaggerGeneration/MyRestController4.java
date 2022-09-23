package com.mytests.spring.springSwaggerGeneration;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/rest4")
public class MyRestController4 {

    @RequestMapping (path = "/p10", method = {RequestMethod.POST})
    public String handleInt(@RequestBody(required = true) Integer rb) {
        return "";
    }
    @RequestMapping (path = "/p11", method = {RequestMethod.POST})
    public String handleStr(@RequestBody(required = false) String rb) {
        return "";
    }
    @RequestMapping (path = "/p12", method = {RequestMethod.POST})
    public String handleStrs(@RequestBody(required = false) List<String> rb) {
        return "";
    }
    @RequestMapping (path = "/p13", method = {RequestMethod.POST})
  public String handlePojo(@RequestBody MyPojo rb) {
      return "";
  }
    @RequestMapping (path = "/p14", method = {RequestMethod.POST})
    public String handlePojos(@RequestBody List<MyPojo> rb) {
        return "";
    }
    @RequestMapping (path = "/p15", method = {RequestMethod.POST})
    public String handleJacksonPojo(@RequestBody MyJacksonPOJO rb) {
        return "";
    }
    @PostMapping("/p2")
    public String create(@RequestPart String doc,
                           @RequestPart(name = "file") MultipartFile file) {
        
        return "";
    }

    
}