package com.kani.springboot.controller;
// http://localhost:8080/login

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/login")
	public String loginValid() {

		return "Hello Controller";

	}

}