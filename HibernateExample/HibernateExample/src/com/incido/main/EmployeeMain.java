package com.incido.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.incido.bean.Employee;
import com.incido.dao.EmployeeDao;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeDao edao=new EmployeeDao();
		Employee emp=new Employee("Nitin Patil", "xxxx@gmail.com", LocalDate.parse("1995-07-22"));
		emp.setEmpid(2);
		String result=edao.updateEmployee(emp);
		System.out.println(result);
	}
}
