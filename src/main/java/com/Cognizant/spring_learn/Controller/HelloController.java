package com.Cognizant.spring_learn.Controller;

import com.Cognizant.spring_learn.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Autowired
    HelloService s;
    @GetMapping("/hello")
    public String sayHello(){
        return s.sayHello();
    }
}
