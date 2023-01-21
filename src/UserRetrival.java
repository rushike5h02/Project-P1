import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRetrival {
	
	public void getUserDetails() {
		Connection connection= null;
		PreparedStatement pstmt = null;
		
try {
	
	ConnectionTest con = new ConnectionTest();
	connection = con.getConnectionDetails();
	pstmt= connection.prepareStatement("Select * from user");
	
	ResultSet rsuser = pstmt.executeQuery();
	
	System.out.println("List of the Users of E-Kart = ");
	System.out.println();
	while(rsuser.next()) {
		System.out.println("User ID    = "+rsuser.getInt(1));
		System.out.println("First Name = "+rsuser.getString(2));
		System.out.println("Last Name  = "+rsuser.getString(3));
		System.out.println("City       = "+rsuser.getString(4));
		System.out.println("Mobile No. = "+rsuser.getInt(5));
		System.out.println("---------------------------------");
	}
	
	connection.close();
	pstmt.close();
	rsuser.close();
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

	public static void main(String[] args) {
		
		UserRetrival userRetrival = new UserRetrival();
		userRetrival.getUserDetails();

	}

}
