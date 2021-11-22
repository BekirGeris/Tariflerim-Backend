package com.example.tariflerim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tariflerim.business.abstracts.RecipeService;
import com.example.tariflerim.core.utilities.result.DataResult;
import com.example.tariflerim.core.utilities.result.Result;
import com.example.tariflerim.entites.concoretes.Recipe;

@CrossOrigin
@RestController
@RequestMapping("/api/recipes")
public class RepiceController {

	private RecipeService recipeService;

	@Autowired
	public RepiceController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Recipe>> getAll(){
		return recipeService.getAll();
	}
	
	@GetMapping("/getTarifsWithUserId")
	public DataResult<List<Recipe>> getTarifsWithUserId(int userId){
		return recipeService.getByUserId(userId);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Recipe recipe) {
		return recipeService.add(recipe);
	}
	
}
