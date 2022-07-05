package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	

	public Employee getEmployee(int id) {
		
		return employeeRepo.findByEmployeeId(id);	
	}



	public Employee addEmployee(Employee newEmployee) {
		
		return employeeRepo.save(newEmployee);
	}
}
