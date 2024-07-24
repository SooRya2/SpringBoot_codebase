package com.incedo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.bean.Employee;
import com.incedo.error.EmployeeNotFoundException;
import com.incedo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	public List<Employee> allEmployee()
	{
		return repo.findAll();
	}
	
	public Employee getEmployeeByID(int empid) throws EmployeeNotFoundException {
		/*Optional<Employee> op=repo.getAllEmployees().stream().filter(e->e.getEmpid()==empid).findAny(); //-->to display details of the empid used in url
		if(op.isPresent())
			return op.get();
		else
			return null;*/
		
		Optional<Employee> op=repo.findById(empid);
		if(op.isPresent())
			return op.get();
		else
			throw new EmployeeNotFoundException("Employee with empid"+empid+"is not available");
	} 
	
	public Employee addEmployee(Employee e)
	{
		Employee emp=repo.saveAndFlush(e);
		return emp;
	}
	
	public String deleteEmployeeByID(int empid) {
		Optional<Employee> op=repo.findById(empid);
		if(op.isPresent()) {
			repo.delete(op.get()); //->finding empployee and deleting
			return "Employee deleted";}
		else
			return "Employee not deleted";
	}
	
	public String updateEmployeebyId(Employee emp)
	{
		Optional<Employee> op=repo.findById(emp.getEmpid());
		if(op.isPresent()) {
			repo.saveAndFlush(emp);
			return "Employee updated";
		}
		else
			return "Employee not updated";
		
	}
	
	
}
