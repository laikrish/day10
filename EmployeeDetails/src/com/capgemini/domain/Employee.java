package com.capgemini.domain;

public class Employee {

	private String employeeName;
	private long employeeid;
	private double salary;
	private String department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, long employeeid, double salary, String department) {
		super();
		this.employeeName = employeeName;
		this.employeeid = employeeid;
		this.salary = salary;
		this.department = department;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
