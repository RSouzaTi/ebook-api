package com.ebook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ebook.model.Books;
import com.ebook.model.SelecioneStatus;
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
	
	@PostMapping("/{codigo}/reserve")
	public Books reservar(@PathVariable Long codigo) {
		 Optional<Books> books = bookRepository.findById(codigo);
		 Books updateBook = books.get();
				 updateBook.setStatus(SelecioneStatus.EMPRESTADO);
		 return adicionar(books.get());
	}
	
	
}

