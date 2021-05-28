package com.educandoweb.courseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
