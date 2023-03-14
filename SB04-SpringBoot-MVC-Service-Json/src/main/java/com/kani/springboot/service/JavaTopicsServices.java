package com.kani.springboot.service;
import java.util.Arrays;
import java.util.List;






public class JavaTopicsServices {
	

	public List getAllTopics() {
		return Arrays.asList(new JavaTopics("SpringBoot","SpringMVC","Spring"),
				new JavaTopics("JPA","Hibernate","JDBC"),
				new JavaTopics("ReactJs","Javascript","UI-Development"));
		public List<JavaTopics> getAllTopics() {
			return Topics;
		}

}
}
