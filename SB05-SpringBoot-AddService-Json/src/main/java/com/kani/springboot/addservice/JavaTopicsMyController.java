package com.kani.springboot.addservice;
// http://localhost:8080/login.spring

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTopicsMyController {
	//JavaTopicsServices topicsService=new JavaTopicsServices();
	@Autowired
	JavaTopicsServices topicsService;
	@RequestMapping("login.spring")
	public String loginValid() {

		return "Welcome to spring boot applictaion";

	}
	@RequestMapping("/javatopics")
	public List getAllTopics() {
		return topicsService.getAllMyTopics();
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/addtopic")
	public void addtopic(@RequestBody JavaTopics topic) {
		topicsService.addTopic(topic);
		
	}
	
   
}