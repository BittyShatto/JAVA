package JDBC;
import java.sql.*;
public class test1 {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			PreparedStatement pst=con.prepareStatement("insert into test values(?,?)");
			pst.setString(1,"t05");
			pst.setString(2,"Alvino");
			int i=pst.executeUpdate();
			System.out.println("Records  affected  "+i);
			con.close();
		}
		catch(Exception e) {System.out.println(e);}
	}

}
