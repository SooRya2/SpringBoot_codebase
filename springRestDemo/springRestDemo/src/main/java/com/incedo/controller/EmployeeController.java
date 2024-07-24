package com.incedo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incedo.bean.Employee;
import com.incedo.error.EmployeeNotFoundException;
import com.incedo.service.EmployeeService;

@RestController // now its going to become a restapi...its purpose is not to search for logical view(@RestController= @Controller+@ResponseBody)
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public List<Employee> sayHello()
	{
		return service.allEmployee();
		//return new Employee(1001,"Nithish","sns.soo@gmail.com",LocalDate.parse("2001-12-15")); //--> here we get the object(attributes and data of employee class) in JSON format
	}
	
	@GetMapping("/{empid}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int empid) throws EmployeeNotFoundException
	{
		Employee emp= service.getEmployeeByID(empid);
		if(emp!=null)
			return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		else
			return new ResponseEntity("Employee Not Found",HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee emp) //--->adding new emp into database......here to create new data we use requestbody and send new data using postman tool in JSON format
	{
		return service.addEmployee(emp);
	}
	
	@DeleteMapping("/{empid}")
	public String deleteEmployee(@PathVariable int empid)
	{
		String result=service.deleteEmployeeByID(empid);
		return result;
	}
	
	@PutMapping()
	public String updateEmployee(@RequestBody Employee emp)
	{
		return(service.updateEmployeebyId(emp));
	}
	
}

