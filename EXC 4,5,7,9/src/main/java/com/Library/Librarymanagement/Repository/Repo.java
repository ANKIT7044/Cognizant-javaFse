package com.Library.Librarymanagement.Repository;

import com.Library.Librarymanagement.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Book,Integer> {

}
