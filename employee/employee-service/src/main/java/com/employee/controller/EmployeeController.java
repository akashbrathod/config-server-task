package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.entity.Contact;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@RefreshScope
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	@Lazy
	private RestTemplate restTemplate;
	
	@GetMapping("/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") int id) {
		
		Employee employee = employeeService.getEmployee(id);
				
		Contact contact =restTemplate.getForObject("http://contact-service/contact/"+id,Contact.class);
		
		employee.setContact(contact);
	
		return employee;
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee newEmployee){
		Employee employee=employeeService.addEmployee(newEmployee);
		return employee;
		
	}
}
