package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import databasesprogram.DBConnection;

public class AddProduct
{
	    public static void addProductDetails() {
	    	
	Connection con=DBConnection.getConneection();
	PreparedStatement ps=null;
	Scanner sc =new Scanner(System.in);
	
	try {
		System.out.println("Enter The Product Details And Add into the DataBase.. ");
		System.out.println("Enter Product Name=>");
		String p_name=sc.next();
		System.out.println("Enter the Product Price=>");
		int p_price=sc.nextInt();
		System.out.println("Enter the Product Description=>");
		String p_desc=sc.next();
		System.out.println("Enter the Product Quantity=>");
		int p_qty=sc.nextInt();
		
		String query="insert into product(p_name,p_price,p_description,p_quantity) values(?,?,?,?)";
		ps=con.prepareStatement(query);
		ps.setString(1,p_name);
		ps.setInt(2, p_price);
		ps.setString(3, p_desc);
		ps.setInt(4, p_qty);
		
		int record =ps.executeUpdate();
		System.out.println(record+" Product is Successfully Stored into the Database..");
		
	}catch(SQLException e)
	{
		e.printStackTrace();
	}
	
	
	    }

}
