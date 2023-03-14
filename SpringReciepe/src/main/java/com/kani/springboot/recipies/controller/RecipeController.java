package com.kani.springboot.recipies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kani.springboot.recipies.entities.Recipe;
import com.kani.springboot.recipies.serviceImpl.RecipeserviceImpl;
import com.kani.springboot.recipies.services.Irecipe;



@RestController
@RequestMapping(value="Recipe")

public class RecipeController {
	@Autowired
	RecipeserviceImpl repo;
	@PostMapping("/addRecipe")
	public ResponseEntity<Boolean> createRecipe(@RequestBody Recipe rec) {
    repo.saveRecipe(rec);
	ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
	System.out.println("response entity=" + responseEntity);
	return responseEntity;

	}
	@GetMapping(path="/getAllRecipe")
	public  ResponseEntity<List<Recipe>> getAllRecipes(){
		List<Recipe> list=repo.getAllRecipes();
		
		return new ResponseEntity<List<Recipe>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	@DeleteMapping(path="/delete/{RecId}")
	public String deleteRecipe(@PathVariable("RecId") Long recId) {
		repo.deleteRecipe(recId);
		return "Deleted";

}
}
