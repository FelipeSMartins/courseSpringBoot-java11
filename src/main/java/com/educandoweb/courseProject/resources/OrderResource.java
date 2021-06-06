package com.educandoweb.courseProject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.courseProject.entities.Order;
import com.educandoweb.courseProject.services.OrderService;

@RestController
@RequestMapping(value = "/orders")

/* Orderresource depende do Orderservice */
public class OrderResource {

	@Autowired
	private OrderService service;

	/*
	 * Metodo endpoint para acessar os usuários, tipo de retorno deste metodo será o
	 * responseentity que é um tipo especifico do spring pra retornar respostas de
	 * requisições web. Findall - método que retorna os usuários.
	 * 
	 * @Getmapping para indicar que este método responde a requisição do tipo get do
	 * http.
	 */

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		/* .body para retornar o corpo da resposta. */
		return ResponseEntity.ok().body(list);

	}

	/* @pathvariable e para o spring aceitar o parametro de chegará na URL */
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
