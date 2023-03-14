package com.ram.springboot.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ram.springboot.dao.StudentNotFoundException;
import com.ram.springboot.entities.Student;
import com.ram.springboot.service.StudentServiceI;

@RestController
@RequestMapping(value="student")

//Connecting ... to Angular 
@CrossOrigin("http://localhost:4200")

public class StudentController {
	@Autowired
    private StudentServiceI service;
	
	
	@PostMapping(path="/create")
	public ResponseEntity<Boolean> createStudent(@RequestBody Student stud) {
		service.createStudent(stud);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	
	@GetMapping(path="/getdetails/{stuId}")
	public ResponseEntity<Student> findStudentById(@PathVariable("stuId") long stuId) {
		Student stu=service.findStudentById(stuId);
		if (stu == null) {
            throw new StudentNotFoundException("Student not found for id=" + stuId);
        }
		return new ResponseEntity<Student>(stu,new HttpHeaders(),HttpStatus.OK);
	}
	// http://localhost:9999/employee/getAll
	//@RequestMapping(value="employee")
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<Student>> findAll(){
		List<Student> list=service.findAllStudents();
		
		return new ResponseEntity<List<Student>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	
	@PutMapping(path="/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student stud){
		stud=service.updateStudent(stud);
		return new ResponseEntity<Student>(stud,new HttpHeaders(),HttpStatus.OK);
	}
	
	@DeleteMapping(path="/delete/{studId}")
	public String deleteStudent(@PathVariable("studId") Long studId) {
		service.deleteStudent(studId);
		return "Deleted";
	}
}
