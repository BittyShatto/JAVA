package JDBC;
import java.sql.*;
public class updatetest1 {

	public static void main(String[] args) {
		try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");      //jdbc:oracle:thin:@localhost:1521:orcl --orcl is the bd instance
            PreparedStatement pst = con.prepareStatement("update test set tid=? where tname=?");
            pst.setString(2, "Alvino");
            pst.setString(1, "t08");
            
            int i = pst.executeUpdate();
            System.out.println("Rows Affected "+i);
            
            con.close();
		}catch(Exception e) {System.out.println(e);}


	}
 
}
