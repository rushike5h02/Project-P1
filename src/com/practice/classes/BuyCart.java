package com.practice.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

//import ConnectionTest;

public class BuyCart {

	public void buyProductDetails() {
		Connection connection= null;
		PreparedStatement pstmt = null;
		
try {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The number Of Product You Want to Buy = ");
	int buyno = sc.nextInt();
	
	for(int j=1; j<=buyno; j++) {
		Scanner scgetbuy = new Scanner(System.in);
	System.out.println("Enter the Details to be Added into Cart ");
	System.out.println();
	
	System.out.println("Enter the Product ID =  ");
	int productid = scgetbuy.nextInt();
	System.out.println("Enter the Product Quantity =  ");
	int quantity = scgetbuy.nextInt();
	
	ConnectionTest con = new ConnectionTest();
	connection = con.getConnectionDetails();
	pstmt = connection.prepareStatement("insert into cart (productID,quantity) values(?,?)");
	
	pstmt.setInt(1, productid);
	pstmt.setInt(2, quantity );
	
	int i = pstmt.executeUpdate();
	System.out.println("Product Added into Cart "+i);
	
	connection.close();
	pstmt.close();
	sc.close();
	scgetbuy.close();
	}
	}catch(Exception e) {
		System.out.println(e);
	}
		}
//public void getBuyCart() {
//	
//	System.out.println("Enter the Details to be Added into Cart ");
//	System.out.println();
//	Scanner scgetbuy = new Scanner(System.in);
//	System.out.println("Enter the Product ID =  ");
//	int proid = scgetbuy.nextInt();
//	System.out.println("Enter the Product Quantity =  ");
//	int proqty = scgetbuy.nextInt();
//	
//	BuyCart buyKart= new BuyCart();
//	buyKart.buyProductDetails(proid, proqty);;
//	
//	scgetbuy.close();
//}
	
	public static void main(String[] args) {		
//		Scanner scbuyno = new Scanner(System.in);
//		System.out.println("Enter The number Of Product You Want to Buy = ");
//		int buyno = scbuyno.nextInt();
//		
//		for(int j=1; j<=buyno; j++) {		
//		}

		BuyCart cart = new BuyCart();
		cart.buyProductDetails();
	
		
		
	}		
	}

