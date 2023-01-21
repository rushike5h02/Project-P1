import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductList {

	void  insertProductDetails(String name, String description, int price, int quantity) throws SQLException {
		
		Connection connection= null;
		PreparedStatement pstmt = null;
		
try {
	
	ConnectionTest con = new ConnectionTest();
	connection = con.getConnectionDetails();
	pstmt= connection.prepareStatement("insert into productlist(name,description,price,quantity)values(?,?,?,?)");
	
	pstmt.setString(1, name);
	pstmt.setString(2, description);
	pstmt.setInt(3, price);
	pstmt.setInt(4, quantity);
	
	int i = pstmt.executeUpdate();
	System.out.println("Product Added into List Succesfully " +i);
	
}catch(Exception e) {
	System.out.println(e);
}
		finally {
			connection.close();
			pstmt.close();
		}
	}

	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=10;i++) {
		
		System.out.println("Enter the Product Name = ");
		String name = sc.next();
		System.out.println("Enter the Product Description = ");
		String desc = sc.next();
		System.out.println("Enter the Product Price = ");
		int price = sc.nextInt();
		System.out.println("Enter the Product Quantity =  ");
		int qty = sc.nextInt();
		
		ProductList prolist = new ProductList();
		prolist.insertProductDetails(name, desc, price, qty);
		}
		sc.close();

	}

}
