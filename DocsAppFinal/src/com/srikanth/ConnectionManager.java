package com.srikanth;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	 private static String url = "jdbc:mysql://localhost:3306/db";    
	    private static String driverName = "com.mysql.cj.jdbc.Driver";   
	    private static String username = "root";   
	    private static String password = "";
	    private static Connection con;
	  //  private static String urlstring;

	    public static Connection getConnection() {
	        try {
	            Class.forName(driverName);
	            try {
	                con = DriverManager.getConnection(url, username, password);
	            } catch (SQLException ex) {
	                // log an exception. fro example:
	                System.out.println("Failed to create the database connection."); 
	            }
	        } catch (ClassNotFoundException ex) {
	            // log an exception. for example:
	            System.out.println("Driver not found."); 
	        }
	        return con;
	    }

}
