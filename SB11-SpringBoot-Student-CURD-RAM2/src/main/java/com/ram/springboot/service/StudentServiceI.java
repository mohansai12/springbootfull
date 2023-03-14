package com.ram.springboot.service;
import java.util.List;

import com.ram.springboot.entities.Student;

public interface StudentServiceI {

    Student createStudent(Student stud);
    
	Student findStudentById(long studentId);
	
	Student updateStudent(Student stud); 
	
	List<Student> findAllStudents();
	
	void deleteStudent(long studId);
	
}
