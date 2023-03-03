package JDBC;
import java.sql.*;
public class deletetest1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			PreparedStatement pst=con.prepareStatement("delete from test where tid=?");
			pst.setString(1,"t07");
			int i=pst.executeUpdate();
			System.out.println("Rows Affected "+i);
			con.close();
		}
		catch(Exception e) {System.out.println(e);}

	}
}