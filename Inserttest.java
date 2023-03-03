
package JDBC;
import java.sql.*;
public class Inserttest {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			//DIS
			String ti="t03";
			String tn="bindu";
			String q="insert into test values('"+ti+"','"+tn+"')";
			stmt.executeUpdate(q);
			System.out.println("Value Inserted");
			con.close();
		}catch(SQLException se) {System.out.println(se);}
		catch(Exception e) {System.out.println(e);}
	}

}
