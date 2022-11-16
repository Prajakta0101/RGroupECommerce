package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import databasesprogram.DBConnection;

public class AddUser
{
	
	public static void addUserDetails() {
    	
		Connection con=DBConnection.getConneection();
		PreparedStatement ps=null;
		Scanner sc =new Scanner(System.in);
		
		
		try {
			System.out.println("Enter The User Details And then you are able to see Products ");
			System.out.println("Enter User Name=>");
			String u_name=sc.next();
			System.out.println("Enter the User Mobile_No=>");
			int u_mob=sc.nextInt();
			System.out.println("Enter User_Email(Optional)=>");
			String u_email=sc.next();
			System.out.println("Enter the User Password(Optional)=>");
			String u_pass=sc.next();
			
			String query="insert into userinformation(u_name,u_mob,u_email,u_password) values(?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1,u_name);
			ps.setInt(2, u_mob);
			ps.setString(3, u_email);
			ps.setString(4, u_pass);
			
			int record =ps.executeUpdate();
			System.out.println(" User is Successfully Login..");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		    }
	
}