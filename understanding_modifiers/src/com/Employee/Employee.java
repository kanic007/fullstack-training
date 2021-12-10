package com.Employee;

public class Employee {

	private String employeName;
	private double salary=200;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private int empNumber;
	public Employee() {
	//	super();
		this("kanic",007);
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeName, int empNumber) {
		super();
		this.employeName = employeName;
		this.empNumber = empNumber;
	}
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	
}
