
import java.sql.SQLException;
import java.util.Scanner;

//import com.practice.classes.Cart;
//import com.practice.classes.ProductRetrival;
//import com.practice.classes.UserRegistration;

import java.sql.DriverManager;



public class EKart {

	public void ekart()  {
		System.out.println("***** Welcome to The E-Kart *****");
		System.out.println();
		System.out.println("1. New User Registration");
		System.out.println();
		System.out.println("2. Admin Login");
		System.out.println();
		try {
		Scanner scchoice = new Scanner(System.in);
		int choice = scchoice.nextInt();

		if(choice==1) {
			UserRegistration use = new UserRegistration();
			use.getUserRegister();
			
			System.out.println();
			ProductRetrival pr = new ProductRetrival();
			pr.getProductInfo();
			
			System.out.println();
			Cart cartbuy = new Cart();
			cartbuy.getBuyproduct();
			
			System.out.println();
			System.out.println("Details Of Order");
			Cart cartbill = new Cart();
			cartbill.getbill();
			
			System.out.println();
			System.out.println("total Reciepts are = ");
			Cart carttotalbill = new Cart();
			carttotalbill.getTotalbillrecipt();
			
//			User user = new User();
//			user.getuserdetails();
			
			System.out.println("*****  Thank Your For Shopping With E-Kart  *****");
			
		}
		else if(choice==2) {
			
//			Admin admin = new Admin();
//			admin.adminmethod();
			
			
		}
		else {
			System.out.println("Sorry For Inconvinience , System Is Not Responding");
		}
		scchoice.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	
	}
}
