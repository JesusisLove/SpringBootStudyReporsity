package com.liu.springboot08starter.controller;

import com.liu.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMyStarterController {

    @Autowired
    HelloService helloService;

    @GetMapping("/sayhello")
    public String hello() {
        String haha = helloService.sayHelloFromLiu("猫猫");
        return haha;
    }
}
