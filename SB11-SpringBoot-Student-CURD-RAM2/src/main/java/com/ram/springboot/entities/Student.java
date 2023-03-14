package com.ram.springboot.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue
	private long studId;
	private String studName;
	private String Address;

	
	public long getStudId() {
		return studId;
	}
	public void setStudId(long studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	
	//constructor
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [Id=" + studId + ", empName=" + studName + ", StudentAddress=" + Address + "]";
	}


}
