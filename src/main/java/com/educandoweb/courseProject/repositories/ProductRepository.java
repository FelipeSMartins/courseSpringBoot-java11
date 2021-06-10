package com.educandoweb.courseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
