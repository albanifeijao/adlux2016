package br.com.adluxfortaleza.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() throws ClassNotFoundException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/adluxfortaleza", "root", "123");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
