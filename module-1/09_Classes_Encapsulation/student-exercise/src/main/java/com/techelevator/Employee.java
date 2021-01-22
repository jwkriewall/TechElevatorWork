package com.techelevator;

public class Employee {

	
	public Employee (int employeeId, String firstName, String lastName, double annualSalary) {}

	private int employeeId;
	private String firstName = "";
	private String lastName = "";
	private double annualSalary;
	private String department = "";
	
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

	public int getEmployeeId() {
		return employeeId;
	}
	
	
	public double getAnnualSalary() {
		return this.annualSalary;
	}
	
	
	public void raiseSalary(double percent) {
		this.annualSalary = (this.annualSalary * percent);
	}
	
	
	public String getFullName() {
		return this.lastName + ", " + this.firstName;
	}
	
	
}
