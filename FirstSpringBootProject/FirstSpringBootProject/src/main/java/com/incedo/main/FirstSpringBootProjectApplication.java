package com.incedo.main;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.incedo.bean.Employee;
import com.incedo.dao.EmployeeDao;

@SpringBootApplication
@ComponentScan("com")
@PropertySource("mydata.properties")//-->when we need to access data from another properties file
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		EmployeeDao edao=ctx.getBean(EmployeeDao.class);
		
		while(true)
		{
			System.out.println("Enter your choice:");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println(edao.saveemployee(new Employee(4,"Soorya","sss.nithish@gmail.com",LocalDate.parse("2010-05-13"))));
				break;
			case 2:
				System.out.println(edao.updateEmployee("Abhishek", 4));
				break;
			case 3:
				System.out.println(edao.deleteEmployee(4));
				break;
			case 4:
				List<Employee> e=edao.getall();
				e.forEach(a->System.out.println(a));
				
			}
		}
		
	}

}
