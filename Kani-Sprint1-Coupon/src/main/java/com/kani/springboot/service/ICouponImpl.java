package com.kani.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kani.springboot.entity.Coupon;
import com.kani.springboot.exceptions.CouponNotFoundException;
import com.kani.springboot.repository.ICouponRepository;
@Service
public class ICouponImpl implements ICoupon{
	@Autowired
	ICouponRepository repo;

	@Override
	public Coupon addCoupon(Coupon coup) {
		// TODO Auto-generated method stub
		return repo.save(coup);
	}

	@Override
	public Coupon findCouponById(Coupon coupId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Coupon> findAllCoupon() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Coupon removeCoupon(int couponId) {
		Optional<Coupon> findById = repo.findById(couponId);
		repo.deleteById(couponId);
		return findById.get();
	}

	@Override
	public Coupon updateCoupon(Coupon coup) {
		// TODO Auto-generated method stub
		return null;
	}

}