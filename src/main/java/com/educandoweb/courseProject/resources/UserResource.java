package com.educandoweb.courseProject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.courseProject.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	/*
	 * Metodo endpoint para acessar os usuários, tipo de retorno deste metodo será o
	 * responseentity que é um tipo especifico do spring pra retornar respostas de
	 * requisições web. Findall - método que retorna os usuários. 
	 * @Getmapping para indicar que este método responde a requisição do tipo get do http.
	 */
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "8888888");
		/* .body para retornar o corpo da resposta. */
		return ResponseEntity.ok().body(u);

	}

}
