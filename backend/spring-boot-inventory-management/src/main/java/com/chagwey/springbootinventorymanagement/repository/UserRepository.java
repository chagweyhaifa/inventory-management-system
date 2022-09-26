package com.chagwey.springbootinventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chagwey.springbootinventorymanagement.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
