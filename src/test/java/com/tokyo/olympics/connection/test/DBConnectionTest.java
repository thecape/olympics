package com.tokyo.olympics.connection.test;

import org.junit.Test;

import com.tokyo.olympics.dao.JdbcConnection;

public class DBConnectionTest extends AbstractTest{
	
	JdbcConnection jdbcConnection = new JdbcConnection();

	@Test
	public void testJDBCMysql () {
		JdbcConnection.dbConnection();
		logger.info("successful");
	}
}
