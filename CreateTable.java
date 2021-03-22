package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/IT_DAY";
		final String user = "root";
		final String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password); 
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IT_students("
                    + "ID INT NOT NULL, "
                    + "NAME VARCHAR (20) NOT NULL, "
                    + "AGE INT NOT NULL, "
                   
                    + "ADDRESS CHAR (25) , "
                    + "PRIMARY KEY (ID))";
            
              stmt.executeUpdate(sql);
 			 System.out.println("table created");
 			 conn.close();

			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}