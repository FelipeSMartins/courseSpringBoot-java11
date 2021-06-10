package com.educandoweb.courseProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseProject.entities.Product;
import com.educandoweb.courseProject.repositories.ProductRepository;

@Service
/*
 * @service registra a classe userservice como serviço que pode ser
 * injetado automaticamente com autowired.
 */
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
