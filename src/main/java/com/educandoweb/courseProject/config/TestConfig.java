package com.educandoweb.courseProject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.courseProject.entities.User;
import com.educandoweb.courseProject.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	/*
	 * Autowired o spring associa a dependencia de user repository aqui dentro do
	 * test
	 */
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Felipe Martins", "fm@gmail.com", "96666666", "0123456");

		/* salva uma lista passada para dentro do DB */
		userRepository.saveAll(Arrays.asList(u1, u2, u3));

	}

}
