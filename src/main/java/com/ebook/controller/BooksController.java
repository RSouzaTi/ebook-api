package com.ebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ebook.model.Books;
import com.ebook.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping
	public List<Books> listar() {
		return bookRepository.findAll();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Books adicionar(@RequestBody Books books) {
		return bookRepository.save(books);

	}

}
