package JDBC;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test2StatementUserInput {

	public static void main(String[] args) {
		
		try{
			Scanner sc = new Scanner(System.in);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");      //jdbc:oracle:thin:@localhost:1521:orcl --orcl is the bd instance
            PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
            
            String sid,sName;
            int deptId;
            System.out.println("Enter Student Id:");
            sid=sc.nextLine();
            System.out.println("Enter Student Name:");
            sName = sc.nextLine();
            System.out.println("Enter Department No:");
            deptId =sc.nextInt();
            
            pst.setString(1, sid);
            pst.setString(2, sName);
            pst.setInt(3, deptId);
            
            int i = pst.executeUpdate();
            System.out.println("Rows Affected "+i);
            con.close();
		}catch(Exception e) {System.out.println(e);}
	}

}
