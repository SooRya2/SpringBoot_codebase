package com.incedo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.incedo.bean.Employee;

@Repository  //--->Interacts with database..similar to component
public class EmployeeDao {
	@Autowired  //--> Reads database connection from the application.properties file
	private JdbcTemplate jdbcTemplate;//-----> provides api to communicate with database
	
	public String saveemployee(Employee emp)
	{
		int rows=jdbcTemplate.update("insert into emptable values(?,?,?,?)",emp.getEmpid(),emp.getDob(),emp.getEmail(),emp.getName());
		if(rows>0)
			return "Employe created";
		else
			return "employee not created";
	}
	
	public String updateEmployee(String name,int id)
	{
		int rows=jdbcTemplate.update("update emptable set fullname=? where empid=?",name,id);
		if(rows>0)
			return "Employee updated";
		else
			return "not updated";
	}
	
	public String deleteEmployee(int id)
	{
		int rows=jdbcTemplate.update("delete from emptable where empid=?",id);
		if(rows>0)
			return "Employee deleted";
		else
			return "Employee not deleted";
	}
	
	public List<Employee> getall()
	{
		List<Employee> a=new ArrayList<>();
		RowMapper<Employee> map=new RowMapper<>() {
			public Employee mapRow(ResultSet rs,int rowNum) throws SQLException{ //--> Resultset contains all the records and 
				Employee e=new Employee();
				e.setEmpid(rs.getInt(1));
				e.setEmail(rs.getString(3));
				e.setName(rs.getString(4));
				return e;
			}
		};
		
		a=jdbcTemplate.query("select * from emptable", map);//-->Row mapper helps in retrieving one row at a time
		return a;
	}
	
	
	
	
	
}
