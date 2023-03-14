package com.kani.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kani.springboot.entity.Coupon;

public interface ICouponRepository extends JpaRepository<Coupon, Integer>{

	static Optional<Coupon> findById(int coupId) {
		// TODO Auto-generated method stub
		return null;
	}

}
