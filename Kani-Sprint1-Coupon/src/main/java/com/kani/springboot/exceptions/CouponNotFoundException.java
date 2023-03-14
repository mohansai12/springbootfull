package com.kani.springboot.exceptions;

public class CouponNotFoundException extends Exception{
	public CouponNotFoundException(String s) {
		super(s);
	}
}
