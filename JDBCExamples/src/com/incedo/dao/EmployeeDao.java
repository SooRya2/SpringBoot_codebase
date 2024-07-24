package com.incedo.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import com.incedo.pojo.Employee;
import com.incedo.util.MyConnection;

import java.sql.Statement;
import java.util.List;
import java.sql.PreparedStatement;


public class EmployeeDao 
{
	Connection con=MyConnection.getDBConnection();
	public List<Employee> getAllEmployee()
	{
		List<Employee> li=new ArrayList<Employee>();
	
		try {
			Statement stat=con.createStatement(); // statement is used for sending sql query to DB
		    ResultSet rs=stat.executeQuery("select * from employee"); //Resultset is used to access query result retrieved from database.
		    while(rs.next()) {
		    	li.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3)));
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return li;
		    
	}
		    public String createEmployee(Employee emp)
		    {
		    	try {
		    		
		    		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");//this prepared statement can take parameter
		    		ps.setInt(1, emp.getEmpid());
		    		ps.setString(2, emp.getName());
		    		ps.setInt(3, emp.getSalary());
		    		int rows=ps.executeUpdate(); //execute update is used for insertion,deletion function while executequery is for reading
		    		if(rows>0)
		    			return "Employee Created....";
		    		else
		    			return "Employee not created...";
		    	}
		    	catch(SQLException e)
		    	{
		    		e.printStackTrace();
		    		return "Employee not created";
		    	}
		    }
		    
		    public String updateEmployee(int id,int salary)
		    {
		    	try {
		    		
		    		PreparedStatement ps=con.prepareStatement("update employee set salary=? where idEmployee=?");//this prepared statement can take parameter
		    		ps.setInt(3, salary);
		    		ps.setInt(1, id);
		    		int rows=ps.executeUpdate(); //exeute update is used for insertion,deletion function while executequery is for reading
		    		if(rows>0)
		    			return "Employee Created....";
		    		else
		    			return "Employee not created";
		    	}
		    	catch(SQLException e)
		    	{
		    		e.printStackTrace();
		    		return "Employee not created";
		    	}
		    }
		    
		    public Employee getEmployee(int id)
		    {
		    	try {
		    		
		    		PreparedStatement ps=con.prepareStatement("select * from employee where idEmployee=?");//this prepared statement can take parameter
		    		ps.setInt(1, id);
		    		ResultSet rs=ps.executeQuery(); 
		    		rs.next(); // goes to first row
		    		return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
		    	}
		    	catch(SQLException e)
		    	{
		    		e.printStackTrace();
		    		return new Employee();
		    	}
		    }
		    
		    
}
