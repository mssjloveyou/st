package com.example.demo.controller;

import com.example.demo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestController {
    static{
        System.out.println("hello TestController");
    }
    @Autowired
    private TestService service;

    @GetMapping("/test")
    public Test test(){
        return service.test();
    }
    @GetMapping("/")
    public void save(){
        service.save();
    }

    public String tt(){
        service = new TestService();
        service.test();
        return "hh";
    }
    public void tc(){

    }
}
