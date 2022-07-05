package com.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Contact {

	@Id
	private int contactId;
	private String email;
	private String contactAddress;
	private Long mobileNumber;
	private int employeeId;
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Contact(int contactId, String email, String contactAddress, Long mobileNumber, int employeeId) {
		super();
		this.contactId = contactId;
		this.email = email;
		this.contactAddress = contactAddress;
		this.mobileNumber = mobileNumber;
		this.employeeId = employeeId;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
