package com.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/{employeeId}")
	public Contact getContact(@PathVariable("employeeId") int id) {
		
		return this.contactService.getContactOfEmployee(id);
	}
	
	@PostMapping("/addContact")
	public Contact addContact(@RequestBody Contact newContact){
					
		return this.contactService.addcontact(newContact);
		
	}
}
