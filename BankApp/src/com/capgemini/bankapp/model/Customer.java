package com.capgemini.bankapp.model;

import java.time.LocalDate;

public class Customer {

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword="
				+ password + ", email=" + email + ", address=" + address
				+ ", dateOfBirth=" + dateOfBirth + ", customerAccount=" + customerAccount + "]";
	}

	private long customerId;
	private String customerName;
	private String password;
	private String email;
	private String address;
	private LocalDate dateOfBirth;
	private BankAccount customerAccount;
	
	public Customer() {
		super();
	}

	public Customer(long customerId, String customerName, String password, String email,
			String address, LocalDate dateOfBirth, BankAccount customerAccount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.customerAccount = customerAccount;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public  String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate DateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BankAccount getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(BankAccount customerAccount) {
		this.customerAccount = customerAccount;
	}
	
	
	
	
}