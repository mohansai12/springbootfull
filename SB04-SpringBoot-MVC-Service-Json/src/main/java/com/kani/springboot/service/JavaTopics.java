package com.kani.springboot.service;
import java.io.Serializable;

public class JavaTopics implements Serializable{
	private String name;
	private String description;
	private String id;
	
	public JavaTopics(String name,String description,String id) {
		this.name=name;
		this.description=description;
		this.id=id;
		
	}
	public String getname() {
		return name;
		
	}
	public String getdescription() {
		return description;
	}
	public String getid() {
		return id;
		
	}

}
