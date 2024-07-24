package com.incedo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.bean.Employee;
import com.incedo.service.EmployeeService;

@Repository
//this employeerepository communicates with the database
//this implementation gets initialized when application context gets initialized 
public interface IEmployeeRespository extends JpaRepository<Employee,Integer>{  //-->Jparepository has key entity class and type of our ID(empid) which is int 

	
}
