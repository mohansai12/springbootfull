package com.kani.springboot.recipies.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kani.springboot.recipies.entities.Recipe;
@Repository
public interface Ireciperepository extends JpaRepository<Recipe,Integer>{

	
	

}
