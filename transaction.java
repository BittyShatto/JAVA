package JDBC;
import java.io.*;
import java.io.DataInputStream;
import java.sql.*;

public class transaction {

	public static void main(String[] args) {
		try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");      //jdbc:oracle:thin:@localhost:1521:orcl --orcl is the db instance

            Statement stmt = con.createStatement();
            
            con.setAutoCommit(false);

            stmt.executeUpdate("insert into student values('S05','Andrews',3)");
            
            con.rollback();
            
            //con.commit(); -- here without commit also same working.

            System.out.println("Value inserted");
            con.close();
		}catch(Exception e) {System.out.println(e);}

	}

}
