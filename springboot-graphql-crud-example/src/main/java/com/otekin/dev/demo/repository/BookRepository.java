package com.otekin.dev.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.otekin.dev.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
