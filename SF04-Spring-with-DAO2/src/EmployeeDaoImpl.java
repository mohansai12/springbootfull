import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;




public class EmployeeDaoImpl implements EmployeeDao {
   	
    // dataSource reference wants database connection 
	 // username,password,url,database 
	  // how this dataSource gets : driver class,url ,username,pass
	  // this dataSource gets username,password like .. from applicationContex_Dao.xml
	private DataSource dataSource;  //10
	              
	
	public EmployeeDaoImpl() {
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource; //driverclass ,url ,username,pass
	}
	
	    
	@Override  //13            // 54  Ravi Saving1 7777
	public void save(Employee employee) {
		  System.out.println("EmployeeDaoImpl  save()");
		// Declare resources
		Connection con = null;
		PreparedStatement pstmt = null;
		try { // Get connection.
			con = dataSource.getConnection(); //14
			// Create statement.                          
			pstmt = con.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?)"); //15
			// Set parameters.
			pstmt.setInt(1, employee.getempno());  //54
			pstmt.setString(2, employee.getempName()); //RAVI
			pstmt.setString(3, employee.getempAddress()); //Saving
			pstmt.setDouble(4, employee.getsal());   //7777
			// Execute statement.
			pstmt.execute();  //16
			// Handle Exceptions
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Clean up resources to avoid memory leaks problems.
		finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Employee get(int empno) {
		 //System.out.println("AccountDaoImpl  get()");
		// Declare resources.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Employee avo = null;
		try {
			// Get connection.
			con = dataSource.getConnection();
			// Create statement object.
			stmt = con.createStatement();
			// Prepare query.
			String query = "SELECT * FROM account WHERE emp_NO=" + empno;
			// Execute query.
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				avo = new Employee();
				avo.setempno(rs.getInt(1));
				avo.setempName(rs.getString(2));
				avo.setAddress(rs.getString(3));
				avo.setsal(rs.getDouble(4));
			}
			// Handle exceptions
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Release resources to avoid memory leaks.
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return avo;
	}

	@Override
	public void remove(int empno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Employee empout) {
		// TODO Auto-generated method stub

	}

}
