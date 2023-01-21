package com.practice.classes;
import java.sql.Connection;
import java.sql.DriverManager;

//Program for insert the multiple student data using JDBC into database.


public class ConnectionTest {

	Connection connection = null;
	
	public Connection getConnectionDetails() { //utility
	
try {

	Class.forName("com.mysql.jdbc.Driver");
	
	connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commerce","root", "root");
	
} catch (Exception e) {
	System.out.println(e);
}
	return connection;
	}

	
}
