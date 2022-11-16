package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Product.AddCart;
import databasesprogram.DBConnection;

public class UserProductAddBill {
	

	public static void userBill()
	{
			Connection con=DBConnection.getConneection();
			PreparedStatement ps = null;
	//	Scanner sc = new Scanner(System.in);
			//System.out.println("please enter Product Id>>");
		//int p_price=sc.nextInt();
	//	String query="select * from product where p_price=?";
			try {
		//		ps=con.prepareStatement(query);
			//	ps.setInt(1, p_price);
				ResultSet rs=ps.executeQuery();
				int p_price1=rs.getInt(3);
				int total=p_price1* AddCart.addProductOrder();
				System.out.println("your total bill is=>"+total);
				
			/*	while(rs.next()) {
					System.out.println("Product id>>"+rs.getInt(1));
					System.out.println("Product name>>"+rs.getString(2));
					System.out.println("Product Price>>"+rs.getInt(3));
					System.out.println("Product Description>>"+rs.getString(4));
					System.out.println("Product Quantity>>"+rs.getInt(5));
				}*/
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


}



