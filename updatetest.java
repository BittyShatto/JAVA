package JDBC;
import java.sql.*;

public class updatetest {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			String q="update test set tid='t09' where tname='Shatto'";
			stmt.executeUpdate(q);
			System.out.println("Value updated");
			con.close();
		}catch(Exception e) {System.out.println(e);}
		
		
	}

}
