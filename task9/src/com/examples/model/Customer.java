package com.examples.model;

public class Customer {

	private int customerId;
	private String customerName;
	private int phoneNumber  ;
	private String email;

   public Customer() {
		super();
	
	}

	public Customer(int customerId, String customerName, int phoneNumber, String email)throws InvalidEmailException {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		
		
		if(email.contains("@") &&( email.contains(".com")|| email.contains(".in"))) {
			this.email=email;	
		}else {
			throw new InvalidEmailException("email should have @ or .com or .in");	
	}
	}
   
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		if(email.contains("@")&& (email.contains(".com")|| email.contains(".in"))){
			this.email = email;
			}
			else {
			
			
			try {
				throw new InvalidEmailException("InvalidEmailException");
			} catch (InvalidEmailException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		
		return this.customerId+ ","+this.customerName + ","+this.phoneNumber +"," +this.email;
	}
}
