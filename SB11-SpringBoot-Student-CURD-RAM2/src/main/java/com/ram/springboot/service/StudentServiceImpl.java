package com.ram.springboot.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.springboot.dao.StudentDaoI;
import com.ram.springboot.entities.Student;



@Service

public class StudentServiceImpl implements StudentServiceI{
	@Autowired
	private StudentDaoI dao;
	
	public Student createStudent(Student stud) {
		return dao.createStudent(stud);
	}
	
	public Student findStudentById(long studId) {
		return dao.findStudentById(studId);
	}
	public Student updateStudent1(Student stud) {
		return dao.updateStudent(stud);
	}
	public List<Student> findAllStudents(){
		 return dao.findAllStudents();
	}
	public void deleteStudent(long studId) {
		 dao.deletestudent(studId);
	}

	@Override
	public Student updateStudent(Student stud) {
		// TODO Auto-generated method stub
		return null;
	}
}

