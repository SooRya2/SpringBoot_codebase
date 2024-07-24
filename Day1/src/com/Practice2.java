package com;
import java.util.*;
import java.util.stream.Collectors;

public class Practice2 {
	
	public static void main(String[] args) {
//	{
//		ArrayList<Integer> a=new ArrayList<>();
//		a.add(123);
//		a.add(4567);
//		a.add(121);
//		a.add(100);
//		a.add(1000);
//		a.add(123);
		List<Integer> a=Arrays.asList(123,4567,121);
		List<Integer> b=a.stream()
				.sorted((n1,n2)->Integer.compare(sumof(n1),sumof(n2)))
				.collect(Collectors.toList());
		
		System.out.println(b);
	}
	
	static int sumof(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}

}
