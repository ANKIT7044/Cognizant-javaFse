package com.Library.Librarymanagement.Controller;

import com.Library.Librarymanagement.Book;
import com.Library.Librarymanagement.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private Repo r;

    @PostMapping
    public Book createBook(Book book){
        return r.save(book);
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id){
        return r.findById(id).orElse(null);
    }
    @GetMapping
    public List<Book> getAllBooks() {
        return r.findAll();
    }

    @DeleteMapping("/{id}")
    public  void deleteBook(@PathVariable int id){
        r.deleteById(id);
    }

    @PutMapping("/{id}")
    public  Book modify(@PathVariable int id,@RequestBody Book updatedBook){
        Optional<Book> optionalBook = r.findById(id);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setName(updatedBook.getName());
            book.setAuthor(updatedBook.getAuthor());
            return r.save(book);
        }
        return null;
    }
}
