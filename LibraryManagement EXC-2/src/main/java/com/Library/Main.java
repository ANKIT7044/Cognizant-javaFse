package com.Library;

import com.Library.Service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService ser=context.getBean("bookService",BookService.class);
        ser.displayBook();
    }
}