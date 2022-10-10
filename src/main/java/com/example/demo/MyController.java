package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService service;


    public MyController(MyService service){
        this.service = service;
    }

    @GetMapping
    public String test(){
        return "test";
    }

    @GetMapping("/getName")
    public String getName(){
        return service.getMycomponentName();
    }

}
