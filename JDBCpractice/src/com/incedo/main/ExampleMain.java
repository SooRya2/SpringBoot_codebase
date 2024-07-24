package com.incedo.main;
import java.util.*;

import com.incedo.dao.ExampleDao;
import com.incedo.pojo.Example;
public class ExampleMain {

	public static void main(String[] args) {
		ExampleDao obj=new ExampleDao();
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
				obj.getall()
.forEach(e->System.out.println(e));
				break;
			case 2:
				
				String result=obj.createEmp(107,"dfsdf");
				System.out.println(result);
				break;
			case 3:
				Example re=obj.getemp(105);
				System.out.println(re);
				break;
			case 4:
				String resul=obj.updateEmp(105, "Soorya");
				System.out.println(resul);
				break;
			case 5:
				return ;
			}
		}
	}

}
