package JDBC;

import java.sql.*;

public class SelectfromTable {

	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/IT_DAY";
		final String user = "root";
		final String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet r = stmt.executeQuery("SELECT * FROM IT_students");
			while (r.next()) {
				System.out.println("Id: "+r.getInt(1));
				System.out.println("Name: "+r.getString(2));
				System.out.println("Age: "+r.getInt(3));
				
				System.out.println("Address: "+r.getString(4));
			}
            conn.close();

		} catch (Exception e) {
			System.out.println("failed selection from  table");
		}

	}

}