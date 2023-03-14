package com.kani.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VotecardApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotecardApplication.class, args);
		System.out.println("Server starts");
	}

}
