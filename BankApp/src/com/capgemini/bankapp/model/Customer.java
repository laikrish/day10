package com.capgemini.bankapp.model;

import java.time.LocalDate;

public class Customer {
	private int customerId;
	private String customerName;
	private String accountType;
	private String password;
	private String email;
	private String address;
	private LocalDate dateOfBirth;
	
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ",accountType=" + accountType + ", password="
				+ password + ", email=" + email + ", address=" + address
				+ ", customerDateOfBirth=" + dateOfBirth + ", ]";
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, String accountType, String password, String email,
			String address, LocalDate dateofBirth) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountType = accountType;
		this.password = password;
		this.email = email;
		this.address = address;
		this.dateOfBirth = dateofBirth;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getPassword() {
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
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


}