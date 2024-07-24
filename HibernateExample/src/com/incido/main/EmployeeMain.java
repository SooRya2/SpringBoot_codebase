package com.incido.main;

import java.time.LocalDate;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.incido.bean.Employee;
import com.incido.dao.EmployeeDao;
import com.incido.dao.Hibexdao;

public class EmployeeMain {
	public static void main(String[] args) {

		Hibexdao edao = new Hibexdao();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter your choice:");
			int c = sc.nextInt();
			switch (c) {
			case 1:
				System.out.println(
						edao.createEmployee(new Employee("Sanjjith", "sasaas.sahs@gmail", LocalDate.parse("1994-01-25"))));
				break;
			case 2:
				Employee e=edao.getEmployee(2);
				System.out.println(e);
				break;
			case 3:
				Employee e1=new Employee("Malathi","sss.malathi@gmail.com",LocalDate.parse("1995-01-25"));
				e1.setEmpid(7);
				String res=edao.updateEmployee(e1);
				System.out.println(res);
				break;
			case 4:
				System.out.println(edao.deleteEmployee(2));
				break;
			case 5:
				//edao.getAll().forEach(e4->System.out.println(e4));
			}
		}
	}
}
