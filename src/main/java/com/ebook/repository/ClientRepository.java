package com.ebook.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebook.model.Books;
import com.ebook.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
	
	Books save(Optional<Client> client);
	

}
