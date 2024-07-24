package com.incedo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import com.incedo.bean.Employee;
import com.incedo.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	private EmployeeService eservice;
	@GetMapping("/create")
	public String getEmployeePage(Model m)
	{
		List<Employee> emps=eservice.allEmployee();
		m.addAttribute("employees",emps);
		return "Employee";
	}
	
	@PostMapping("/addEmployee") //---> to make sure details are not shown in the url
	public String addEmployeePage(Employee emp,Model m) //emp object has the all entered values mapped to it.
	{
		Employee e=eservice.createEmployee(emp);
		//m.addAttribute("msg","Employee created is"+ e);
		//return "Employee"; //when addemployee is invoked employee page will be displayed without employee data
		return "redirect:create"; //redirects to create url
	}
	
	
	
}
