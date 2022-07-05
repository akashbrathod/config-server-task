package com.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.repo.ContactRepo;

@Service
public class ContactService {

	
	@Autowired
	private ContactRepo contactRepo;
	
	public Contact getContactOfEmployee(int employeeId){
	
		return contactRepo.findByEmployeeId(employeeId);
	}
	
	
	public Contact addcontact(Contact newContact) {
		
		return contactRepo.save(newContact);
	}
}
