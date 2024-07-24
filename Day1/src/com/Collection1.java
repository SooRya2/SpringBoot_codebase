package com;
import java.util.*;

public class Collection1 {
	
	
	public List<String> getValues(HashMap<String,String> m)
	{
		
		ArrayList<String> li=new ArrayList<>();
		for(Map.Entry<String, String> e:m.entrySet())
			li.add(e.getValue());
		Collections.sort(li);
		return li;
		
		
	}
	
	public HashMap<Character,Integer> countChars(char[] arr)
	{
		int val;
		HashMap<Character,Integer> h=new HashMap<>();
		for(char c:arr)
		{
			if(h.containsKey(c))
			{
				val=h.get(c);
				h.put(c, val+1);
				
			}
			else
				h.put(c, 1);
		}
		return h;
	}
	
	
	public HashMap<Integer,Integer> getSquares(int[] arr)
	{
		HashMap<Integer,Integer> a=new HashMap<>();
		for(int i:arr)
		{
			a.put(i, i*i);
		}
		return a;
	}
	
	public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> h)
	{
		HashMap<Integer,String> a=new HashMap<>();
		for(Map.Entry<Integer, Integer> e:h.entrySet())
		{
			if(e.getValue()>=90)
				a.put(e.getKey(),"Gold");
			else if(e.getValue()>=80 && e.getValue()<90)
				a.put(e.getKey(), "Silver");
			else if(e.getValue()>=70 && e.getValue()<80)
				a.put(e.getKey(),"Bronze");
				
		}
		return a;
		
	}

	public int getSecondSmallest(int[] arr)
	{
		int second;
		ArrayList<Integer> a=new ArrayList<>();
		for(int i:arr)
		{
			a.add(i);
		}
		Collections.sort(a);
		second=a.get(1);
		return second;
 	}

	public ArrayList<Integer> votersList(HashMap<Integer,Integer> h)
	{
		ArrayList<Integer> a=new ArrayList<>();
		for(Map.Entry<Integer, Integer> e:h.entrySet())
		{
			if(e.getValue()>18)
				a.add(e.getKey());
		}
		return a;
		
	}
}
