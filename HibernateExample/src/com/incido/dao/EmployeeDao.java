package com.incido.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.incido.bean.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	private SessionFactory sf;
	public EmployeeDao() { // SF used in constructor in case multiple objects are created.
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
		Employee e=ses.get(Employee.class, empid);//Employee.class is used to mention which one is the entity class as there can be many entity classes(tables
		tx.commit();
		ses.close();
		return e;
	}
	public String updateEmployee(Employee emp) {
		System.out.println("===================="+emp.getEmpid());//Empid is sent separately using setid();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		Employee e=ses.get(Employee.class, emp.getEmpid());// e object here is in managed state whereas emp is in new state.
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
	
	public String deleteEmployee(int id)
	{
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		Employee e=ses.get(Employee.class, id);
		ses.delete(e);
		tx.commit();
		ses.close();
		return "Employee deleted";
		
	}
	
	public List<Employee> getAll()
	{
		List<Employee> s=new ArrayList<>();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		Query<Employee> q=ses.createQuery("from Employee");
		s=q.list();
		tx.commit();
		ses.close();
		return s;
	}
	
}
