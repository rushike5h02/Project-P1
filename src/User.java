

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.DriverManager;

public class User {

	//create object of Product,UserOpearationsn and Cart to call that methods
		ProductRetrival pr = new ProductRetrival();
	
		UserRegistration use = new UserRegistration();
		Cart cart =new Cart();
		ReturnEcomerse re=new ReturnEcomerse();
		
		
		
		public void getuserdetails() throws SQLException {
			//user registration
			use.getUserRegister();
			
			
			String choice="";
			while(!choice.equals("2")) {
				
		    System.out.println("**********Welcome to E-shop**********");
			System.out.println("press '1' to show product list");
		    System.out.println("press '2' to buy the product");
				
			 Scanner sc1=new Scanner( System.in);
	         choice=sc1.next();
	         
	         switch(choice) {
	         
	         case "1":
	        	 //To display the prodctlist
	        	 pr.getProductInfo();
	        	  break;
	         case "2":
	        	 // To Buy the product
	        	 cart.getBuyproduct();
//	        	 Scanner sc3=new Scanner( System.in);
//	        	 System.out.println("press '1' to Continue to order & otherwise press '2' to exit");
//	             int entry =sc3.nextInt();
//	        	
//	        	 if(entry==1) {
//	        		 // To display cart details & calclate Total price
	        		 cart.getTotalbillrecipt();
	        		 System.out.println("**********Thank you for shopping**********"); 
//	        	 }
//	        	 else if(entry==2) {
	        		// Returning to Ecomerse class
	        		 re.getReturnEcomerse(); 
//	         }
	        	  break;
	         default:
	             System.out.println("Inavlid input ");
	         }
	        sc1.close();
	     }
			      // Returning to Ecomerse class
//		re.getReturnEcomerse();		
			
		}		
}
	


