package com.capgemini.bankapp.controller;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.model.Customer;

public class DataBase {
   
	private static Set<Customer> customers = new HashSet<>();
	private static Set<BankAccount> accounts = new HashSet<>();
	
	
	public DataBase() {
		super();
		
	}
	static {

		BankAccount account1 = new BankAccount(17888, "SAVINGS", 50000);
		BankAccount account2 = new BankAccount(15643, "CURRENT", 40000);
		BankAccount account3 = new BankAccount(156443, "SAVINGS", 700000);
		
		
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);

		Customer customer1 = new Customer(76,"sunny","sunpw","sun@gmail.com","vdf",LocalDate.of(1880,3,12),account1);
		Customer customer2 = new Customer(77,"varu", "diad","var@gmail.com","dfsf",LocalDate.of(1890,5,12),account2);
		Customer customer3 = new Customer(82,"krishna","sdsds","kc@gmail.com","dfd",LocalDate.of(1880,6,12),account3);
		
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		
		
	}

	public static Set<Customer> getCustomer() {
		return customers;
	}

	public static Set<BankAccount> getBankAccount() {
		return accounts;
	}

	public static void setCustomers(Set<Customer> customers) {
		DataBase.customers = customers;
	}

	public static void setBankAccounts(Set<BankAccount> accounts) {
		DataBase.accounts = accounts;
	}
}