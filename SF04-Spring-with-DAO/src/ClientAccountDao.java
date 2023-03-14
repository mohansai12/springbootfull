import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ClientAccountDao.java
public class ClientAccountDao {
	public static void main(String[] args) {   //1.
		                                     //2
ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext_Dao.xml");
		
AccountDao accDao = (AccountDao)factory.getBean("accountDao"); //3

     // Bean
		Account account = new Account();  //11
		account.setAccno(55);
		account.setAccName("Ravi");
		account.setAccType("Saving1");
		account.setBal(7777.00);
			//System.out.println(account);
		// save bean data into database 	
		accDao.save(account);  //12  goto AccountDaoImpl.java 
			
		// retriving data form beans class   //17
	    System.out.println("Account No : "+account.getAccno());
		System.out.println("Account Name : "+account.getAccName());
		System.out.println("Account Type :"+account.getAccType());
		System.out.println("Account Balance :"+account.getBal());
				
	} //close main 18
} // close class 19
