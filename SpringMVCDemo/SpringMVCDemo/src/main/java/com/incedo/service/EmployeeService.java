package com.incedo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.bean.Employee;
import com.incedo.repo.IEmployeeRespository;

@Service
//used to create,insert,update data....responsible for this class is employee repository
public class EmployeeService {
	
	@Autowired
	private IEmployeeRespository repo;
	//controller will call this method
	public Employee createEmployee(Employee emp)
	{
		return repo.saveAndFlush(emp); //save the data and flush the cache
	}
	
	public List<Employee> allEmployee()
	{
		return repo.findAll(); //---> findall reads all the data
	}
}
