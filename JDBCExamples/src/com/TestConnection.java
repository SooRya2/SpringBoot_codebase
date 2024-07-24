package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args)
	{
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/incedo","root","Malathi@3125");
			//incedo is database name
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from employee");
			//this will execute the query and returns the result
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));//points to 2nd column and its getstring bcoz 2nd column is name
			System.out.println("Connected....");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
