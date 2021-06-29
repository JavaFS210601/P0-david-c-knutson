package com.revature.utils;
// this is daves project
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//This Class contains the logic that manages the connection to our database
//It will have a method called getConnection() that will return Connection objects
//We will need these Connection object in our DAO layer to interact with our database
public class ConnectionUtil {
	
	public static Connection getConnection() throws SQLException {
		
		//For compatibility with other technologies/frameworks, we'll need to register our Driver
		//This process makes the application aware of what Driver class (what SQL dialect) we're using
		try {
			Class.forName("org.postgresql.Driver"); //try to find and return the postgresql Driver Class
		} catch (ClassNotFoundException e) {
			System.out.println("Class wasn't found :(");
			e.printStackTrace(); //prints the exception message to the console
		}
		
		//We need to provide our database credentials
		//We'll hardcode them for now, but we'll see how to hide this username/password in environment variables
		
		String url = "jdbc:postgresql://javafs210601.c9hxbolytvxu.us-east-2.rds.amazonaws.com:5432/postgres?currentSchema=CompanyX";
		//String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=Krusty_Krab";
		String username = "postgres";
		String password = "password"; //this will be whatever password you set in postgres
									  //hopefully you just left it as password...
		
		
		return DriverManager.getConnection(url, username, password);
		
	}
	
}

//javafs210601.c9hxbolytvxu.us-east-2.rds.amazonaws.com