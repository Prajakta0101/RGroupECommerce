package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import databasesprogram.DBConnection;
import mainclasses.MainClass;
import user.UserProductAddBill;

public class AddCart {
	
	// public static void main(String[] args) { addProductOrder(); }
		
	  static int p_qty;
	 public static int addProductOrder() {
	    	
			Connection con=DBConnection.getConneection();
			PreparedStatement ps=null;
			Scanner sc =new Scanner(System.in);
			
			try {
				
				System.out.println("Please Enter the Product Quantity you are Order=>");
				System.out.println("Otherwisw Go to see main product type (Y)=>");
			    p_qty=sc.nextInt();
				
				if(p_qty !='y' ) {
				String query="insert into UsersProductQty(u_pqty) values(?)";
				ps=con.prepareStatement(query);
				
				//  ps.setString(1,p_name); 
				//  ps.setInt(2, p_price);
				//  ps.setString(3, p_desc);
				  ps.setInt(1, p_qty);
				 
				
				int record =ps.executeUpdate();
				System.out.println(" Order is Successfully Place (Add) into the Cart");
				
			//	  UserProductAddBill.userBill();     
		        // ShowProduct.productDisplay();
				MainClass.productRcall();
				}
				else
				{
				//	ShowProduct.productDisplay();
					MainClass.productRcall();
				}
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			return p_qty;			
		}
			
			
	}
	 