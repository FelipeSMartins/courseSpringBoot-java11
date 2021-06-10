package com.educandoweb.courseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseProject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
