package com.capgemini.bankapp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
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

		Customer customer1 = new Customer(76,"sunny","account1","sunnihitha","sun@gmail.com","vdf",LocalDate.of(1880,3,12));
		Customer customer2 = new Customer(77,"varu","account2", "diad","var@gmail.com","dfsf",LocalDate.of(1890,5,12));
		Customer customer3 = new Customer(82,"krishna","account3","sdsds","kc@gmail.com","dfd",LocalDate.of(1880,6,12));
		
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		
		BankAccount account1 = new BankAccount(17888, "SAVINGS", 57800);
		BankAccount account2 = new BankAccount(15643, "CURRENT", 45600);
		BankAccount account3 = new BankAccount(156443, "SAVINGS", 780000);
		
		
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
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