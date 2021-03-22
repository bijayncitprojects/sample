package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDatabase {
	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/IT_DAY";
		final String user = "root";
		final String password = "";
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password); 
		    Statement stmt = conn.createStatement();
		    String query="UPDATE IT_students SET AGE=14 WHERE ID = 2";
              stmt.executeUpdate(query);
			 System.out.println("record updated");
			 conn.close();

		
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

}