package com.chagwey.springbootinventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chagwey.springbootinventorymanagement.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
