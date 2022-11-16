package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import databasesprogram.DBConnection;
import mainclasses.BlankClass;

public class SelectProduct {
	
	/*
	  public static void main(String[] args) { productOperation(); }
	 */	
	public static void productOperation()
	{
		System.out.println("Please Enter The Product SR Number:=>");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) 
		{
		case 1:
			ProductDesc(1);
			AddCart.addProductOrder();
			break;
		case 2:
			ProductDesc(2);
			AddCart.addProductOrder();
			break;
		case 3:
			ProductDesc(3);
			AddCart.addProductOrder();
			break;
		case 4:
			ProductDesc(4);
			AddCart.addProductOrder();
			break;
		case 5:
			ProductDesc(5);
			AddCart.addProductOrder();
			break;
		case 6:System.out.println("Exit");
		    ProductDesc(6);
			BlankClass.exit();
			break;
			default:
				System.out.println("You are Entered Wrong Product Id  Please Enter Correct Product Id=>");
		
		
		}
		
	}
	public static int ProductDesc(int p_id)
	{
			Connection con=DBConnection.getConneection();
			PreparedStatement ps = null;
		//	Scanner sc = new Scanner(System.in);
			//System.out.println("please enter Product Id>>");
		//	int p_id=ch;
			String query="select * from product where p_id=?";
			try {
				ps=con.prepareStatement(query);
				ps.setInt(1, p_id);
				ResultSet rs=ps.executeQuery();
				
		     	while(rs.next()) {
					System.out.println("Product id>>"+rs.getInt(1));
					System.out.println("Product name>>"+rs.getString(2));
					System.out.println("Product Price>>"+rs.getInt(3));
					System.out.println("Product Description>>"+rs.getString(4));
					System.out.println("Product Quantity>>"+rs.getInt(5));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return p_id;
		}


}
