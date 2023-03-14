//AccountDao.java
public interface EmployeeDao {
	public void save(Employee employee);

	public void update(Employee employee);

	public void remove(int empno);

	public Employee get(int empno);

}