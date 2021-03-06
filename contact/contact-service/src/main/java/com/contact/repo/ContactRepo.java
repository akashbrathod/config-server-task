package com.contact.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contact.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

	Contact findByEmployeeId(int employeeId);
	
}
