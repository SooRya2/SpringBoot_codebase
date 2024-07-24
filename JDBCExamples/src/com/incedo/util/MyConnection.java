package com.incedo.util;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MyConnection {
	private static Connection con;
	
	static { //static block always exceutes first and only one time
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/incedo","root","Malathi@3125");
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getDBConnection()
	{
		return con;
	}
}
