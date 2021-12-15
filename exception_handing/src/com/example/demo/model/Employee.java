package com.example.demo.model;

import com.example.demo.exceptions.RangeCheckException;

public class Employee {
	
	private int employeeid;
	private String employeeName;
	private String desingnation;
	private double salary;
	
	public Employee() {
		super();
		
	}
	
	public Employee(int employeeid, String employeeName, String desingnation, double salary)throws RangeCheckException {
		
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.desingnation = desingnation;
		if(salary<=0) {
			
			throw new RangeCheckException("Salary should be a postive value");
		}
		else {
			this.salary = salary;
		}
		
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
		if(salary<=0) {
			try {
			throw new RangeCheckException("Salary should be a postive value");
			}catch(RangeCheckException e) {
				e.printStackTrace();
			}
		}else {
			this.salary = salary;
		}
		
	
		
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeName=" + employeeName + ", desingnation="
				+ desingnation + ", salary=" + salary + "]";
	}
}
