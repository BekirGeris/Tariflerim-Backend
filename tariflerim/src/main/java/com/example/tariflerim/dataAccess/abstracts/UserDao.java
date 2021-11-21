package com.example.tariflerim.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tariflerim.entites.concoretes.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	List<User> findAll();
	
	User getByUserId(int userId);
	
	User getByEmailAndPassword(String email, String password);
}	
