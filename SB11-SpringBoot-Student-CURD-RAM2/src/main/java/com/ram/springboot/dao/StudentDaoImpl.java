package com.ram.springboot.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.ram.springboot.entities.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDaoI {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public Student createStudent(Student stud) {
		return entityManager.merge(stud);
	}

	@Override
	public Student findStudentById(long studId) {
		return entityManager.find(Student.class,studId);
	}

	@Override
	public Student updateStudent(Student student) {
		//Employee emp=entityManager.find(Employee.class,employee.getEmpId());
		
		Student stud=findStudentById(student.getStudId());
		stud.setStudName(student.getStudName());
		stud.setAddress(student.getAddress());
		stud=entityManager.merge(stud);
		return stud;
	}
	
	@Override
	public List<Student> findAllStudents() {
		                                // Select * from Employee
		Query q = entityManager.createQuery("select e from Student e");
	    List<Student> list=q.getResultList();
		return list;
	}
	@Override
	public void deletestudent(long studId) {
		Student emp=entityManager.find(Student.class, studId);
		entityManager.remove(emp);
	}

}
	
