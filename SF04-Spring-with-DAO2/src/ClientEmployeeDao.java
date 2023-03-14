import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ClientAccountDao.java
public class ClientEmployeeDao {
	public static void main(String[] args) {   //1.
		                                     //2
ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext_Dao.xml");
		
EmployeeDao empDao = (EmployeeDao)factory.getBean("EmployeeDao"); //3

     // Bean
		Employee account = new Employee();  //11
		account.setempno(5);
		account.setempName("hari");
		account.setAddress("hyd");
		account.setsal(75267.00);
			//System.out.println(account);
		// save bean data into database 	
		empDao.save(account);  //12  goto AccountDaoImpl.java 
			
		// retriving data form beans class   //17
	    System.out.println("Employee No : "+account.getempno());
		System.out.println("Employee Name : "+account.getempName());
		System.out.println("Employee Address :"+account.getempAddress());
		System.out.println("Employee salary :"+account.getsal());
				
	} //close main 18
} // close class 19
