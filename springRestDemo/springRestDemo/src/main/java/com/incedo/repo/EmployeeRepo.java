package com.incedo.repo;

import java.time.LocalDate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.incedo.bean.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

	
}
