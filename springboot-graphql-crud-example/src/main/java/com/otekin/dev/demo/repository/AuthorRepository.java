package com.otekin.dev.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.otekin.dev.demo.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
