package com.educandoweb.courseProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseProject.entities.Category;
import com.educandoweb.courseProject.repositories.CategoryRepository;

@Service
/*
 * @service registra a classe Categoryservice como serviço que pode ser injetado
 * automaticamente com autowired.
 */
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
