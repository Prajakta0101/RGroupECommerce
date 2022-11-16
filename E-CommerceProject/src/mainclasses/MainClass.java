package mainclasses;


import Product.AddCart;
import Product.AddProduct;
import Product.SelectProduct;
import Product.ShowProduct;
import user.AddUser;
import user.UserProductAddBill;


public class MainClass
{
	public static void main(String[] args) {
       // AddProduct.addProductDetails();
		System.out.println("........Welcome to Shopping.....");
	     	
			AddUser.addUserDetails();
			
			productRcall();
         
	}
	
	
	
	 public static void productRcall() {
	 
     	// UserProductAddBill.userBill();
	 
		 System.out.println("....Product.."); 
		 
		 ShowProduct.productDisplay();
		 
		 System.out.println("....Product Information..");
		 
		  SelectProduct.productOperation();
		  
		  System.out.println("If you are Instrested this product... ");
		  
		  AddCart.addProductOrder(); 
		 

	 
	 }
	
	 	 
	
}