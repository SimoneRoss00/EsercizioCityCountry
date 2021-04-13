package it.objectmethod.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtils {
	
	private static final String URL = "jdbc:mysql://localhost:33061/world";
	private static final String USER = "omdev";
	private static final String PASS = "omdev";

	public static Connection getConnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}
