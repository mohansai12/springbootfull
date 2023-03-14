package com.kani.springboot.recipies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kani.springboot.recipies.entities.Recipe;
import com.kani.springboot.recipies.repository.Ireciperepository;
import com.kani.springboot.recipies.services.Irecipe;

@Service
public class RecipeserviceImpl implements Irecipe {
	@Autowired
	Ireciperepository repo;

	@Override
	public List<Recipe> getAllRecipes() {
		
		return repo.findAll();
	}

	@Override
	public Recipe saveRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return repo.save(recipe);
	}

	@Override
	public void updateRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void deleteRecipe(long recipeId) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Recipe getRecipeDetails(int recipeId) {
		// TODO Auto-generated method stub
		return repo.findById( recipeId).get();
	}

	

}
