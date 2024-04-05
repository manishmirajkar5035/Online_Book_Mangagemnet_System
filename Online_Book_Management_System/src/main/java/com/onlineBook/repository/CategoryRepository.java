package com.onlineBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineBook.model.Category;



public interface CategoryRepository extends JpaRepository<Category, Integer> {

	public Boolean existsByName(String name);

}
