package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class test2 {

	public static void main(String[] args) {
	        try{
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");      //jdbc:oracle:thin:@localhost:1521:orcl --orcl is the bd instance

	            Statement stmt = con.createStatement();

	            stmt.executeUpdate("create table student(sid varchar2(20) primary key,sname varchar2(30),deptId integer)");

	            System.out.println("Table Created");
	            
	            con.close();
	        }catch(Exception e){System.out.println(e);
	        }

	}

}
