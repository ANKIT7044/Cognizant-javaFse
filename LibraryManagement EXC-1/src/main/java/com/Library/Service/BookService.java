package com.Library.Service;

import com.Library.Repo.BookRepository;

public class BookService {
   private BookRepository repo;

   public void setRepo(BookRepository repo){
       this.repo=repo;
   }
   public void displayBook(){
       System.out.println("BOOK INFO: "+repo.getBookInfo());
    }
}
