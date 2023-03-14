package com.kani.springboot.service;
// http://localhost:8080/login.spring

import java.sql.Array;
import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTopicsMyController {
	//JavaTopicsServices topicsService=new JavaTopicsServices();
	JavaTopicsServices topicsService;
	@RequestMapping("login.spring")
	public String loginValid() {

		return "Welcome to spring boot applictaion";

	}
	@RequestMapping("/JavaTopics")
	public List getAllTopics() {
		return topicsService.getAllTopics();
		
	}
   
}