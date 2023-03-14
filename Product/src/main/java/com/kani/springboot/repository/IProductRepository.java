package com.kani.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kani.springboot.entities.Product;


public interface IProductRepository extends JpaRepository<Product,Integer>{

	Product findBy(Class<Product> class1, long productId);

	


	

}
