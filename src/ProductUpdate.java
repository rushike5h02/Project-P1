import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductUpdate {

void  updateProductDetails(int productID,int quantity) throws SQLException {
		
		Connection connection= null;
		PreparedStatement pstmt = null;
		
try {
	
	ConnectionTest con = new ConnectionTest();
	connection = con.getConnectionDetails();
	pstmt= connection.prepareStatement("update productlist set quantity = ? where productID=?");
	
	pstmt.setInt(1, quantity);
	pstmt.setInt(2, productID);

	int i = pstmt.executeUpdate();
	System.out.println("Product updated into List Succesfully " +i);
	
}catch(Exception e) {
	System.out.println(e);
}
		finally {
			connection.close();
			pstmt.close();
		}
	}

void getUpdatedList() throws SQLException {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the Product Quantity =  ");
	int qty = sc.nextInt();
	System.out.println("Enter the ProductID =  ");
	int productID = sc.nextInt();
	
	ProductUpdate productUpdate = new ProductUpdate();
	productUpdate.updateProductDetails(productID,qty);
	
	sc.close();
}
	
	public static void main(String[] args) throws SQLException {
		
		ProductUpdate proupdate  = new ProductUpdate();
		
		proupdate.getUpdatedList();

	}

}
