package com.ebook.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.ebook.model.Books;

public class ClientController {

	@GetMapping("/client/{id_client}")
	public ListBooksReserve<Books>Books 
}