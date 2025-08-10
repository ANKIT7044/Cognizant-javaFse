package com.Library.Service;

import com.Library.Repository.BookRepository;
import org.springframework.stereotype.Service;


public class BookService {
    private BookRepository repo;
    private  String serviceName;

    public  BookService(String serviceName){
        this.serviceName=serviceName;
    }

    public void setRepo(BookRepository repo){
        this.repo=repo;
    }
    public void displayBook(){

        System.out.println(serviceName);
        System.out.println("BOOK INFO: "+repo.getBookInfo());
    }
}
