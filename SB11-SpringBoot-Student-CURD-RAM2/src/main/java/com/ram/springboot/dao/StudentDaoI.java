package com.ram.springboot.dao;
import java.util.List;

import com.ram.springboot.entities.Student;

public interface StudentDaoI {
	
	Student createStudent(Student stud);
	Student findStudentById(long studId);
	Student updateStudent(Student stud); 
	List<Student> findAllStudents();
	void deletestudent(long studId);
}
