package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public String myComponentName;

    public MyComponent(){
        this.myComponentName = "RC30";
    }

    public String getMyComponentName() {
        return myComponentName;
    }
}
