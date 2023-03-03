package JDBC;

import java.sql.CallableStatement;
import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.*;
import java.sql.SQLException;

public class callablestmt {

	public static void main(String[] args) {
		 try
	        {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
	        CallableStatement cst = con.prepareCall("{call INTEST(?,?)}");
	        cst.setString(1, "D");
	        cst.setString(2,"DDDDD");
	        System.out.println("RECORD INSERTED");
	        cst.executeUpdate();
	        con.close();
	        }catch(SQLException se) {System.out.println(se);}
	        catch(Exception e) {System.out.println(e);}
	    }
	}
