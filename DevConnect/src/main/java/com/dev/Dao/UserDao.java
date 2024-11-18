package com.dev.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.Model.User;

public interface UserDao extends JpaRepository<User, String>{
	
	public User findByUsername(String username);
}
