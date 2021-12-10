package com.customer;

public class Customer {

	private String customerName;
	private int customerNumber;
	public Customer() {
		//super();
		this("taj",101);
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, int customerNumber) {
		super();
		this.customerName = customerName;
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
}
