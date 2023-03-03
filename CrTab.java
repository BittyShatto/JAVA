package JDBC;

//create table employee(empid varchar2(10),empage number);
import java.sql.*;

public class CrTab {
	
	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from customer");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			con.close();
		}catch(Exception e) {System.out.println(e);}

	}

}
