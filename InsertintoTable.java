package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertintoTable {
	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/IT_DAY";
		final String user = "root";
		final String password = "";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO IT_students VALUES(?,?,?,?)");
       
        
         do{
 				System.out.println("enter id");
 				stmt.setInt(1, sc.nextInt());
 				
 				System.out.println("enter your name");
 				stmt.setString(2, sc.next());
 				
 				System.out.println("enter your age");
 				stmt.setInt(3, sc.nextInt());
 				
 				System.out.println("enter your address");
 				stmt.setString(4, sc.next());
 			 stmt.executeUpdate();
 			
 				
 				System.out.println("press e to exit ");
 				String promt = sc.next();
 				
 				if(promt.equalsIgnoreCase("e")) {
 					break;
 				}
 				
 				
				
         }while(true);
	
		
 			System.out.println("records inserted");
             conn.close();

		
			
			
		} catch (Exception e) {
			System.out.println("Failed to insert records");
		}
		
	}

}