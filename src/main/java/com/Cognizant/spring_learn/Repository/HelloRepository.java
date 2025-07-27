package com.Cognizant.spring_learn.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {
    public  String sayHello(){
        return "Hello World";
    }
}
