package com.kani.springboot.controller;
// http://localhost:8080/login.spring

import java.sql.Array;
import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("login.spring")
	public String loginValid() {

		return "Hello Controller-3";

	}
	@RequestMapping("/JavaTopics")
	public List getAllTopics() {
		return Arrays.asList(new JavaTopics("SpringBoot","SpringMVC","Spring"),
				new JavaTopics("JPA","Hibernate","JDBC"),
				new JavaTopics("ReactJs","Javascript","UI-Development"));
	}
   
}