package com.example.demo.model;

public class Employee {
	
	private int employeeid;
	private String employeeName;
	private String desingnation;
	private double salary;
	
	public Employee() {
		super();
		
	}
	
	public Employee(int employeeid, String employeeName, String desingnation, double salary) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.desingnation = desingnation;
		this.salary = salary;
	}

	
	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesingnation() {
		return desingnation;
	}

	public void setDesingnation(String desingnation) {
		this.desingnation = desingnation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		
		return this.employeeid+ ","+this.employeeName + ","+this.desingnation +"," +this.salary;
	}
}
