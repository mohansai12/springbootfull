package com.kani.springboot.recipies.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Recipe")
public class Recipe {
	@Id
	@GeneratedValue
	private long RecipeId;
	private String Recipename;
	private boolean veg;
	private int servings;
	private String instructions;

	

	public long getRecipeId() {
		return RecipeId;
	}

	public void setRecipeId(long recipeId) {
		RecipeId = recipeId;
	}

	public String getRecipename() {
		return Recipename;
	}

	public void setRecipename(String recipename) {
		Recipename = recipename;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Recipe() {
		super();
	}

}
