package databasesprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
	  public static Connection getConneection() {
		  Connection con=null;
		  try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/EcommerceDetails?characterEncoding=utf8";
			con=DriverManager.getConnection(url, "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return con;
	}
	
}