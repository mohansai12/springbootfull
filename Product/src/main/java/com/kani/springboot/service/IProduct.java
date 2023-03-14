package com.kani.springboot.service;

import java.util.List;

import com.kani.springboot.entities.Product;


public interface IProduct {
	Product createProduct (Product pro); 
	Product findProductById (long proId);
	Product updateProduct(Product pro); 
	List<Product> findAllProduct();
	
	void deleteProduct(long proId);
	

	
	
	
	
	
	
	

}
