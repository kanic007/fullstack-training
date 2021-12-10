package com.Employee;

public class EmployeeService {

     public  double calculateBonus(Employee sal) {
		return  ((sal.getSalary()/100)*33);
		
	}
}
