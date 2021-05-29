package com.educandoweb.courseProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseProject.entities.User;
import com.educandoweb.courseProject.repositories.UserRepository;

@Service
/*
 * @service registra a classe userservice como serviço que pode ser
 * injetado automaticamente com autowired.
 */
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
