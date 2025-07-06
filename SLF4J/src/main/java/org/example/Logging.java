package org.example;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;


public class Logging {
    private static final Logger log= LoggerFactory.getLogger(Logging.class);
    public static  void main(String[] args){
        log.error("This is an error message");
        log.warn("This is warning message");
    }
}
