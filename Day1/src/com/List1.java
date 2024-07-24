package com;
import java.util.*;




public class List1
{
	public static void main(String args[])
	{
		ArrayList<Student> s=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Insert 2.Search 3.Delete 4.Display 5.Exit");
		while(true) {
			
			System.out.println("Enter your option:");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("Enter the item to be inserted:");
				String s1=sc.next();
				s.add(new Student(s1));
				
			}
			if(n==2)
			{
				System.out.println("Enter the item to be searched");
				String s2=sc.next();
				int flag=1;
				for(Student sa:s)
				{
					if(sa.getS().equals(s2))
					{
			    		System.out.println("Item found in the list");
			    		flag=0;
					}
			    		
			    }
				if(flag==1)
					System.out.println("Item not found");
			}
			
			if(n==3)
			{
				System.out.println("Enter the item to be deleted:");
				String s3=sc.next();
				if(s.contains(s3))
				{
					s.remove(s3);
				}
				else
					System.out.println("Item not found");
				
			    
			}
			if(n==4)
			{
				System.out.println("The items in the list are:");
				for(Student sa:s)
				{
					System.out.println(sa);
				}
			
		    }
		}
	}
}
			
		
		
	


