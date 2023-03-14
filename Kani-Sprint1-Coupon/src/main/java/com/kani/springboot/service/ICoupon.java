package com.kani.springboot.service;

import java.util.List;

import com.kani.springboot.entity.Coupon;



public interface ICoupon {
	Coupon addCoupon (Coupon coup); 
	Coupon findCouponById (Coupon coupId);
	Coupon updateCoupon(Coupon coup); 
	List<Coupon> findAllCoupon();
	
	Coupon removeCoupon(int coupId);
	
	

}
