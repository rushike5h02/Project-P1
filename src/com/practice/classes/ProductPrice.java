package com.practice.classes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductPrice {

	public void getPrice(int productID) {
		
		Connection connection= null;
		PreparedStatement pstmt = null;
		
try {
	
	ConnectionTest con = new ConnectionTest();
	connection = con.getConnectionDetails();
	pstmt =connection.prepareStatement("select price from productlist where productID=?");
	
	ResultSet rs=pstmt.executeQuery();
	pstmt.setInt(1, productID );
	while(rs.next()) {
		System.out.println("Price = "+rs.getInt(1));
	}
	connection.close();
	pstmt.close();
	rs.close();
	
}catch(Exception e) {
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		Scanner scgetbuy = new Scanner(System.in);
		System.out.println("Enter the Product ID =  ");
		int proid = scgetbuy.nextInt();
		
		ProductPrice productPrice =new ProductPrice();
		productPrice.getPrice(proid);
		
		
		scgetbuy.close();
		
	}

}
