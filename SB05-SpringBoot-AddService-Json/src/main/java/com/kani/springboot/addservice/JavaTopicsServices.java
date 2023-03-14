package com.kani.springboot.addservice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class JavaTopicsServices {
	public List topics=Arrays.asList(new JavaTopics("SpringBoot","SpringMVC","Spring"),
			new JavaTopics("JPA","Hibernate","JDBC"),
			new JavaTopics("ReactJs","Javascript","UI-Development"));
	List<JavaTopics> myTopics=new ArrayList <JavaTopics>(topics);

	

	public List <JavaTopics> getAllMyTopics() {
		return myTopics;
		
	}
	public void addTopic(JavaTopics topic) {
		myTopics.add(topic);
		// TODO Auto-generated method stubf
		
	}
}
