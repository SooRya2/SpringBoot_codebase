package com.incedo.main;
import java.util.*;

import com.incedo.dao.EmployeeDao;
import com.incedo.pojo.Employee;
public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeDao obj=new EmployeeDao();
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("1.for get All Employee \n 2.create new Employee 3.for get Employee by ID\n 4:for update Employee\n 5.for exit");
		
		
		
		while(true)
		{
			System.out.println("Enter your choice:");
			int c=sc.nextInt();
			switch(c)
			{
			case 1:
				obj.getAllEmployee()
.forEach(e->System.out.println(e));
				break;
			case 2:
				
				String result=obj.createEmployee(new Employee(105,"Monish",2400));
				System.out.println(result);
				break;
			case 3:
				Employee re=obj.getEmployee(120);
				System.out.println(re);
				break;
			case 4:
				String resul=obj.updateEmployee(107, 23232);
				System.out.println(resul);
				break;
			case 5:
				return ;
			}
		}
	}

}
