package com.incido.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.incido.bean.Employee;


public class EmployeeDao {
	private SessionFactory sf;
	public EmployeeDao() {
		sf=new Configuration().configure().buildSessionFactory();
	}
	
	public String createEmployee(Employee emp) {
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(emp);
		tx.commit();
		ses.close();
		return "Employee created!!!!";
	}
	public Employee getEmployee(int empid) {
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		Employee e=ses.get(Employee.class, empid);
		tx.commit();
		ses.close();
		return e;
	}
	public String updateEmployee(Employee emp) {
		System.out.println("===================="+emp.getEmpid());
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		Employee e=ses.get(Employee.class, emp.getEmpid());
		if(e!=null) {
			e.setName(emp.getName());
			e.setEmail(emp.getEmail());
			ses.update(e);
		}
		else
			return "Employee Not Available";
		tx.commit();
		ses.close();
		return "Employee Updated!!";
	}
	
}
