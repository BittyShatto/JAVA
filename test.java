//Create table test (tid varchar2(10)not null primary key,tname varchar2(10))

package JDBC;
import java.sql.*;

public class test {

	public static void main(String[] args) {
               try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
					Statement stmt=con.createStatement();
					String q="Create table test (tid varchar2(10)not null primary key,tname varchar2(10))";
					stmt.executeUpdate(q);
					System.out.println("Table Created");
					con.close();
				}catch(Exception e) {System.out.println(e);}

			}

		}
