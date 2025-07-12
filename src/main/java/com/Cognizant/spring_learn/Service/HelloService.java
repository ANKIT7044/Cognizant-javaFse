package com.Cognizant.spring_learn.Service;


import com.Cognizant.spring_learn.Repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class HelloService {
    @Autowired
    HelloRepository r;
    private  static final Logger logger=LoggerFactory.getLogger(HelloService.class);
    public  String sayHello(){
        logger.info("Start");
        String s=r.sayHello();
        logger.info("End");
        return s;

    }
}
