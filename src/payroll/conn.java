package payroll;
import java.sql.*;
public class conn {

	public Connection c;         //instances for the connection
	public Statement s;            
	
	public conn()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");           //This library for establishing db connections
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","1234");       // Location(Path) , uname , password of database
			s= c.createStatement();
								
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
