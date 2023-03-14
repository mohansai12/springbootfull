package com.kani.springboot.recipies.services;

import java.util.List;

import com.kani.springboot.recipies.entities.Recipe;

public interface Irecipe {
	public List<Recipe>getAllRecipes();
	public Recipe saveRecipe(Recipe recipe);
	public void updateRecipe(Recipe recipe);
	public void deleteRecipe(long recipeId);
	public Recipe getRecipeDetails(int recipeId);

}
