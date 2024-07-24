package com.incedo.pojo;

public class Example {
	private int Empid;
	private String Name;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Example(int empid, String name) {
		super();
		Empid = empid;
		Name = name;
	}
	
	public Example() {
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return Empid+"\t"+"\t"+Name;
	}
	

}
