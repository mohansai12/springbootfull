package com.kani.springboot.controller;

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

import com.kani.springboot.entities.Product;

import com.kani.springboot.service.IProduct;




@RestController
@RequestMapping(value="product")

public class ProductController {
	private static final com.kani.springboot.entities.Product Product = null;
	@Autowired
	IProduct ipro;
	
	
	@PostMapping(path="/create")
	public ResponseEntity<Boolean> createProduct(@RequestBody Product pro) {
		
		ipro.createProduct(pro);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	@GetMapping(path="/getdetails/id/{productById}")
	public ResponseEntity<Product> findProductById(@PathVariable("proId") long proId) {
		ipro.findProductById(proId);
		
		return new ResponseEntity<Product>(Product,new HttpHeaders(),HttpStatus.OK);
	}
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<Product>> findAll(){
		List<Product> list=ipro.findAllProduct();
		
		return new ResponseEntity<List<Product>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	
	@PutMapping(path="/update")
	public ResponseEntity<Product> updateEmployee(@RequestBody Product pro){
		ipro.updateProduct(pro);
		return new ResponseEntity<Product>(Product,new HttpHeaders(),HttpStatus.OK);
	}
	@DeleteMapping(path="/delete/{proId}")
	public String deleteEmployee(@PathVariable("proId") Long proId) {
		ipro.deleteProduct(proId);
		return "Deleted";
	}
	
	


}
