package com.tokyo.olympics.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JdbcConnection {
	private static final Logger logger = LogManager.getLogger(JdbcConnection.class);
	public static void dbConnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");	
		} catch (ClassNotFoundException e) {
			logger.error("driver not found");
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","123");
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
		if (conn!= null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}

}
