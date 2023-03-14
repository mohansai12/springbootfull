import java.io.Serializable;

public class Employee implements Serializable {
	private int empno;
	private String empName;
	private String Address;
	private double sal;

	public Employee() {
	}

	public int getempno() {
		return empno;
	}

	public void setempno(int empno) {
		this.empno = empno;
	}

	public String getempName() {
		return empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public String getempAddress() {
		return Address; 	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public double getsal() {
		return sal;
	}

	public void setsal(double sal) {
		this.sal = sal;
	}

	
	

	
}
