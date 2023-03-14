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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.kani.springboot.entity.Coupon;
import com.kani.springboot.service.ICoupon;

@RestController
@RequestMapping(value="Coupon")
public class CouponController {
	private static final com.kani.springboot.entity.Coupon coupon = null;
	@Autowired
	ICoupon repo;
	
	@PostMapping(path="/create")
	public ResponseEntity<Boolean> createCoupon(@RequestBody Coupon coup) {
		
		repo.addCoupon(coup);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	
	
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<Coupon>> findAll(){
		List<Coupon> list=repo.findAllCoupon();
		
		return new ResponseEntity<List<Coupon>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	
	@DeleteMapping("/removeUser/id/{couponId}")
	public ResponseEntity<Coupon> deleteById(@PathVariable Integer couponId){
		return new ResponseEntity<Coupon>(repo.removeCoupon(couponId),HttpStatus.OK);
		
		
	}
}
