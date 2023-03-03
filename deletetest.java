//delete from test where tid='t03';

package JDBC;
import java.sql.*;

public class deletetest {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			String q="delete from test where tid='t03'";
			stmt.executeUpdate(q);
			System.out.println("Value deleted");
			con.close();
		}catch(Exception e) {System.out.println(e);}
		
		
		
	}
}
