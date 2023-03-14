package com.kani.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kani.springboot.entities.Product;
import com.kani.springboot.repository.IProductRepository;

@Service

public class ProductImpl implements IProduct{  
@Autowired
IProductRepository irepo;
	@Override
	public Product createProduct(Product pro) {
		return irepo.save(pro); 
	}
	public Product findProductById(long productId) {
		return irepo.findBy(Product.class,productId);
	}

	@Override
	public Product updateProduct(Product pro) {
		Product pro1=findProductById(pro.getProductId()); 
		pro1.setProductName(pro.getProductName());
		pro1.setProductPrice(pro.getProductPrice()); 
		pro1=irepo.save(pro);
		return pro1;

	}

	@Override
	public List<Product> findAllProduct() {
		return irepo.findAll();
	}

	@Override
	public void deleteProduct(long productId) {
		Product pro1=irepo.findBy(Product.class,productId);
		irepo.delete(pro1);
	}
	
}