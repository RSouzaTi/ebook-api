package com.ebook.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Reserve {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_reserve;
	
	
	@Enumerated(EnumType.STRING)
	private SelecioneStatus status;
	

}
