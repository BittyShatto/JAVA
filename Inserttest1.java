//insert into test values('t04','test1');

package JDBC;
import java.sql.*;

public class Inserttest1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			String q="insert into test values('t04','test1')";
			stmt.executeUpdate(q);
			System.out.println("Value Inserted");
			con.close();
		}catch(Exception e) {System.out.println(e);}

	}

}
