package com.otekin.dev.demo.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.otekin.dev.demo.entity.Author;
import com.otekin.dev.demo.entity.Book;
import com.otekin.dev.demo.repository.AuthorRepository;
import com.otekin.dev.demo.repository.BookRepository;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private BookRepository bookRepository;

	public Iterable<Book> allBooks() {
		return bookRepository.findAll();
	}

	public Book book(Long id) {
		return bookRepository.findById(id).orElseGet(null);
	}

	public Iterable<Author> allAuthors() {
		return authorRepository.findAll();
	}

	public Author author(Long id) {
		return authorRepository.findById(id).orElseGet(null);
	}
}
