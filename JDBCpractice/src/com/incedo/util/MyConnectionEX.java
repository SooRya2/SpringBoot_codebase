package com.incedo.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionEX {
	private static Connection con;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/incedo","root","Malathi@3125");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
		
		public static Connection getDBConnection(){
			return con;
		}
	}
	


