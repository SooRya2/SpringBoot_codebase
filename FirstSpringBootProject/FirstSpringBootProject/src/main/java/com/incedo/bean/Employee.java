package com.incedo.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Employee {
	
	private int empid;
	private String name;
	private String email;
	private LocalDate dob;
	
	public Employee()
	{
		
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Employee(int empid, String name, String email, LocalDate dob) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	
	public String toString()
	{
		return empid+"\t"+email+"\t"+name+"\t";
	}
	
	
	/*@Value("${empid}")
	private int id;
	@Value("${name}")
	private String name;
	@Autowired
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printEmployee()
	{
		System.out.println("Employee Id: "+ id);
		System.out.println("EMployee name:"+name);
		System.out.println("City :"+address.getCity());
		System.out.println("Employee country: "+address.getCountry());
	}*/

}
