package com.incedo.dao;
import org.hibernate.SessionFactory;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.incedo.bean.Employee;


public class EmployeeDao {
	private SessionFactory sf;
	public EmployeeDao() {
		sf=new Configuration().configure.buildSessionFactory();
	}
	public String createEmployee(Employee emp)
	{
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(emp);
		tx.commit();
		ses.close();
		return "EMployee created!!!";
		}

}
