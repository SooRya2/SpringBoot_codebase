package com.incedo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.incedo.pojo.Example;
import com.incedo.util.MyConnectionEX;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class ExampleDao {
	Connection con = MyConnectionEX.getDBConnection();

	public List<Example> getall() {
		List<Example> s = new ArrayList<>();
		try {
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery("select * from example");
			while (rs.next()) {
				s.add(new Example(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;

	}

	public String createEmp(int id,String name) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into example values(?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			int rows = ps.executeUpdate();
			if (rows > 0)
				return "Employee created";
			else
				return "Employee not created";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Employee NOt created";
		}

	}

	public String updateEmp(int id, String Name) {
		try {
			PreparedStatement ps = con.prepareStatement("update example set Name = ? where Empid=?");
			ps.setString(2, Name);
			ps.setInt(1, id);
			int rows = ps.executeUpdate();
			if (rows > 0)
				return "Employee updated";
			else
				return "Not updated";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Not Updated";
		}
	}

	public Example getemp(int id) {
		try {
			PreparedStatement ps = con.prepareStatement("select * from example where empid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			return new Example(rs.getInt(1), rs.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
			return new Example();
		}

	}

}
