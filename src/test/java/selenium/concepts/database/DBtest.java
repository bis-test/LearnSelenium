package selenium.concepts.database;
import java.sql.*;  

public class DBtest 
{

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root"); 
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  

		while(rs.next()) 
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
	}


}


