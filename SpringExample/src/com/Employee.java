package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int empid;
	private String name;
	private String email;
	@Autowired //-->Automatically searches address obj in IOC and attachs it or uses it
	//@Qualifier("address1") //--->When both byname and bytype is meeting exception"
	private Address address; // here employee has a dependency on address.
	
	
	public Employee()
	{
		
	}
	
	public Employee(Address address)
	{
		this.address=address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printEmployee()
	{
		System.out.println("EMployee Id:"+empid);
		System.out.println("Name"+name);
		System.out.println("Email"+email);
		System.out.println("City:"+address.getCity());
		
	}
}
