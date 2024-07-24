package com;

public class Practice3 {
	
	public static void main(String[] args)
	{
	
		String s="abcde1234f6";
		int a=0,b=5;
		String s1=swap(s,a,b);
		System.out.println(s1);
	}
	
	static String swap(String s,int c,int d)
	{
		char[] c1=s.toCharArray();
		char temp=c1[c];
		c1[c]=c1[d];
		c1[d]=temp;
		return new String(c1);
	}

}
