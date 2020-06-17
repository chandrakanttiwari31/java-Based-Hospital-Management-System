package com.hospital.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {

	static Connection conn = null;

	public static Connection establishConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital22377", "root", "12345678");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {



	}
}
