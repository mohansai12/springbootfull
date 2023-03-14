package com.kani.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb03SpringBootMvcBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb03SpringBootMvcBeansApplication.class, args);
		System.out.println("SpringBoot Tomcat server start");
	}

}
