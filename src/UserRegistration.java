import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserRegistration {
	
	public UserRegistration getUserRegister() {
	UserRegistration userreg = new UserRegistration();
		try {
		
		System.out.println("For User Registration Please");
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Your First Name = ");
		String fname = sc.next();
		System.out.println("Enter Your Last Name = ");
		String lname = sc.next();
		System.out.println("Enter Your City  = ");
		String cit= sc.next();
		System.out.println("Enter Your Mobile Number  = ");
		long mobno = sc.nextLong();
		System.out.println("Enter Your User Name  = ");
		String username = sc.next();
		System.out.println("Enter Your Password  = ");
		int pass = sc.nextInt();
		
			Class.forName("com.mysql.jdbc.Driver");
				
			// step...2.....Establish connection
				
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/E_Commerce", "root", "root");
			
			// step ...3... create statement
			
			PreparedStatement psmt = con.prepareStatement("insert into user (firstname,lastname,city,mobileno,username,password) values (?,?,?,?,?,?)");
	
			// step ...4.... prepare sql statement
			psmt.setString(1, fname);
			psmt.setString(2, lname);
			psmt.setString(3, cit);
			psmt.setLong(4, mobno);
			psmt.setString(5, username);
			psmt.setInt(6, pass);

			
			// step ...5.....submit sql statement
			
			int i = psmt.executeUpdate();
			
			// step...6.... process result
			
			System.out.println("Registration Succesfull" + i);
			System.out.println("Hello "+fname+" "+lname+" Welcome to the E-Kart");
			con.close();
				psmt.close();
				sc.close();
				
		} catch (Exception e) {
				System.out.println(e);

			}	
		return userreg;
	}
	
	
	public static void main(String[] args) {
		
		UserRegistration use = new UserRegistration();
		use.getUserRegister();
	}

}
