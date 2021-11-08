package com.example.tariflerim.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tariflerim.entites.concoretes.Recipe;

@Repository
public interface RecipeDao extends JpaRepository<Recipe, Integer>{

	List<Recipe> findAll();
	
	List<Recipe> getByUserId(int userId);
	
}
