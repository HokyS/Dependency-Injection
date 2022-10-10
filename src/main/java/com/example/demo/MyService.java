package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent component;

    public MyService(MyComponent component){
        this.component = component;
    }
    public String getMycomponentName(){
        return component.getMyComponentName();
    }
}
