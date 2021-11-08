package com.example.tariflerim.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tariflerim.core.utilities.result.DataResult;
import com.example.tariflerim.core.utilities.result.Result;
import com.example.tariflerim.entites.concoretes.Recipe;

@Service
public interface RecipeService {
	
	DataResult<List<Recipe>> getAll();
	
	DataResult<List<Recipe>> getByUserId(int userId);
	
	Result add(Recipe recipe);
}
