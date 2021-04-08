package com.ebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ebook.model.Client;
import com.ebook.repository.ClientRepository;

public class ClientController {

	//@GetMapping("/client/{id_client}");
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping
	public List<Client> listarclient() {
		return clientRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Client adicionar(@RequestBody Client client) {
		return clientRepository.save(client);

	}
	
	
	
	
}