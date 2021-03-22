package JDBC;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseCreate {
	
	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306";
		final String user = "root";
		final String password = "";
		
			
		try {
			    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection(url, user, password); 
				Statement stmt = conn.createStatement();
				stmt.executeUpdate("CREATE DATABASE IT_DAY");
     			 System.out.println("db created");
     			 conn.close();
	
			
		}catch (Exception e) {
			System.out.println("failed to create database");
		}
		
	}

}