package com.incido.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.incido.bean.Employee;
import java.util.ArrayList;
import java.util.List;

public class Hibexdao 
{
	private SessionFactory sf;
	public Hibexdao()
	{
		sf=new Configuration().configure().buildSessionFactory();
	}

	public String createEmployee(Employee emp)
	{
		Session ses=sf.openSession();
		Transaction ts=ses.beginTransaction();
		ses.save(emp);
		ts.commit();
		ses.close();
		return "Employee created";
				
	}
	
	public Employee getEmployee(int id)
	{
		Session ses=sf.openSession();
		Transaction ts=ses.beginTransaction();
		Employee e=ses.get(Employee.class, id);
		ts.commit();
		ses.close();
		return e;
	}
	
	public String updateEmployee(Employee emp)
	{
		Session ses=sf.openSession();
		Transaction ts=ses.beginTransaction();
		Employee e=ses.get(Employee.class, emp.getEmpid());
		if(e!=null)
		{
			e.setName(emp.getName());
			e.setEmail(emp.getEmail());
			e.setDob(emp.getDob());
			
		}
		else
			return "Employee not created";
		ts.commit();
		ses.close();
		return "Employee created";
	}
	
	public String deleteEmployee(int id)
	{
		Session ses=sf.openSession();
		Transaction ts=ses.beginTransaction();
		Employee e=ses.get(Employee.class, id);
		ses.delete(e);
		ts.commit();
		ses.clear();
		return "Employee deleted";
	}
}
