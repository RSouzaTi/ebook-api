package com.ebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebook.model.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {

}
