package com.example.tariflerim.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tariflerim.business.abstracts.RecipeService;
import com.example.tariflerim.core.utilities.result.DataResult;
import com.example.tariflerim.core.utilities.result.Result;
import com.example.tariflerim.core.utilities.result.SuccessDataResult;
import com.example.tariflerim.core.utilities.result.SuccessResult;
import com.example.tariflerim.dataAccess.abstracts.RecipeDao;
import com.example.tariflerim.entites.concoretes.Recipe;

@Service
public class RecipeManager implements RecipeService{
	
	private RecipeDao recipeDao;
	
	@Autowired
	public RecipeManager(RecipeDao recipeDao) {
		super();
		this.recipeDao = recipeDao;
	}

	@Override
	public DataResult<List<Recipe>> getAll() {
		return new SuccessDataResult<List<Recipe>>(recipeDao.findAll(), "Tarifler Listelendi", 201);
	}

	@Override
	public DataResult<List<Recipe>> getByUserId(int userId) {
		return new SuccessDataResult<List<Recipe>>(recipeDao.getByUserId(userId), "Kullanıcıya ait tarifler sıralandı.", 202);
	}

	@Override
	public Result add(Recipe recipe) {
		recipeDao.save(recipe);
		return new SuccessResult("Terif kaydedildi.", 203);
	}
}
