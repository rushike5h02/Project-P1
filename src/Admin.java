

import java.sql.SQLException;
import java.util.Scanner;

public class Admin {

public void adminmethod() throws SQLException {
	System.out.println("Welcome to The Admin Section");
    System.out.println("1. To view list of products");
    System.out.println("2. To Update productlist ");
    System.out.println("3. To see list of Users");
    System.out.println("4. To see list of User Purchase History ");
    
    Scanner scadmin=new Scanner( System.in);
    int choiceadmin=scadmin.nextInt();
    
    switch(choiceadmin) {
    case 1:
   	 ProductRetrival pr = new ProductRetrival();
		pr.getProductInfo();
		break;
    case 2:
   	ProductUpdate proupdate  = new ProductUpdate();
		proupdate.getUpdatedList();
    case 3:
   	 UserRetrival userRetrival = new UserRetrival();
		userRetrival.getUserDetails();
    case 4:
   	 Cart cart = new Cart();
		cart.getbill();
		break;
//    default:
//   	 System.out.println("Sorry For Inconvinience , System Is Not Responding");
    }
    scadmin.close();
	
	
}
}
