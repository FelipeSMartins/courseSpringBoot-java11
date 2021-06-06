package com.educandoweb.courseProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseProject.entities.Order;
import com.educandoweb.courseProject.repositories.OrderRepository;

@Service
/*
 * @service registra a classe userservice como serviço que pode ser
 * injetado automaticamente com autowired.
 */
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
