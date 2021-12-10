package com.example.demo.services;

import com.example.demo.model.Employee;

public class EmployeeService {
     
	// DRY Principle followed
	public double calculateBonous(Employee employee) {
		return calculateBonous(employee.getSalary()) ;
	}
	
	// Overloading Method
	
	public double calculateBonous (double salary) {
		return salary * .30;
	}
	
	// Overloading Method with autoboxing
	public double calculateBonous (Double salary) {
		return (salary *0.30)+1000;
	}
	
	public Employee updatedSalary(Employee employee) {
		double updatedSalary = employee.getSalary()+20000;
		employee.setSalary(updatedSalary);
		return employee;
	}
}
