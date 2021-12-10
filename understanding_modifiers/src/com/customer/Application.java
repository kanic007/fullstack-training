package com.customer;
import com.Hotel.*;
import com.Employee.*;

public class Application {

	public static void main(String[] args) {
		
		Customer headFirst = new Customer();
		System.out.println(headFirst.getCustomerName());
		System.out.println(headFirst.getCustomerNumber());
		
		Hotel bodyFirst =  new Hotel();
		
		System.out.println(bodyFirst.getHotelName());
		System.out.println(bodyFirst.getHotelNumber());
		
		Employee last = new Employee();
		System.out.println(last.getEmployeName());
		System.out.println(last.getEmpNumber());
		
		EmployeeService show = new EmployeeService();
		System.out.println(show.calculateBonus(last));
		

	}

}
