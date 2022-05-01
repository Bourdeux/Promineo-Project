package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private String connString = "jdbc:mysql://127.0.0.1:3306/game";
	private Connection connection;
	
	
	public DBConnection () {}
		
	public Connection connect() throws SQLException {
		connection = DriverManager.getConnection(connString, "user", "0524");
		System.out.println("Connected successfully");
		return connection;
	}
	
	public void disconnect() throws SQLException {
		
		if(connection == null) {
			System.out.println("No connection found.");
			return;
		}		
		connection.close();
		System.out.println("Disconnected.");
		
	}
	
		
	
	
}
