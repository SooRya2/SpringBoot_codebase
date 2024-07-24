package com;
import java.util.*;
import java.util.Map.Entry;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection1 c=new Collection1();
		HashMap<String,String> ma=new HashMap<>();
		ma.put("Nithish","A");
		ma.put("Soorya","D");
		ma.put("Amit", "C");
		
		List<String> l=c.getValues(ma);
		System.out.print(l);
		
		Collection1 c1=new Collection1();
		char[] a=new char[4];
		a[0]='a';a[1]='c';a[2]='c';a[3]='e';
		HashMap<Character,Integer> h=c1.countChars(a);
        System.out.println(h);
		
		Collection1 c2=new Collection1();
		int[] arr= {1,2,3,4,5};
		HashMap<Integer,Integer> g=c.getSquares(arr);
		System.out.println(g);
		
		Collection1 c3=new Collection1();
		HashMap<Integer,Integer> v=new HashMap<>();
		v.put(101, 95);
		v.put(102,80);
		v.put(103, 70);
		HashMap<Integer,String> m=c3.getStudents(v);
		System.out.println(m);
		
		Collection1 c4=new Collection1();
		int[] ar= {2,5,3,6,8,4};
		int ac=c4.getSecondSmallest(ar);
		System.out.println(ac);
		
		Collection1 c5=new Collection1();
		HashMap<Integer,Integer> h1=new HashMap<>();
		h1.put(101, 17);
		h1.put(102,19);
		h1.put(103, 20);
		ArrayList<Integer> a1=c5.votersList(h1);
		System.out.println(a1);
	}
}
