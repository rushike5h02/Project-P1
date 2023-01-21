import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductRetrival {
	
	public ProductRetrival getProductInfo() {
		
		ProductRetrival proret = new ProductRetrival();
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commerce","root","root");
		
		//select query
		PreparedStatement ps=con.prepareStatement("select * from productlist order by productID asc");
		
		ResultSet rs=ps.executeQuery();
		
		System.out.println("*****  Welcome to the E-Kart  *****  ");
		System.out.println();
		System.out.println("Shop From The Variety of Products");
		System.out.println();
		while(rs.next()) {
			
			System.out.println("Product ID   = "+" " +rs.getInt(1));
			System.out.println("Product Name ="+" " +rs.getString(2));
			System.out.println("Description  =" +" "+rs.getString(3));
			System.out.println("Price        =" +" "+rs.getInt(4));
			System.out.println("Quantity     =" +" "+rs.getInt(5));
			System.out.println("-------------------------------");
		}
		
		con.close();
		ps.close();
		rs.close();
		
	}
	
	catch(Exception e) {
		System.out.println(e);
	}
	return proret;
}

	public static void main(String[] args) {
		
		ProductRetrival pr = new ProductRetrival();
		pr.getProductInfo();
		
	}

}
