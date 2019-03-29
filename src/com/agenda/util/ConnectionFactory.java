package com.agenda.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionFactory {
		
	public Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jbc.Driver");
			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/agendabd","root","");
		}catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}


