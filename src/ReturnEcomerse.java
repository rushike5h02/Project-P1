

import java.sql.SQLException;
import java.util.Scanner;

import com.practice.classes.EKart;

public class ReturnEcomerse {
	public void getReturnEcomerse() throws SQLException {
		  Scanner s=new Scanner(System.in);
	         EKart e=new EKart();
	         System.out.println("press '1'  to continue while close the shop enter '2' button");
	         int enter =s.nextInt();
	        if(enter==1) {
	        	e.ekart();
	        }
	        //Exit
	        else if(enter==2){
	        	 System.out.println("************ Thank you for visiting E-Cart*****************");
	        }
	        s.close();
	}

}
