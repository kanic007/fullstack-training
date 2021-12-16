package com.example;

public class Staff {

	private int staffId;
	private String staffname;
	private String staffspecialization;
	private int staffPhoneNumber;
	
	
	public Staff() {
		super();

	}


	public Staff(int staffId, String staffname, String staffspecialization, int staffPhoneNumber) {
		super();
		this.staffId = staffId;
		this.staffname = staffname;
		this.staffspecialization = staffspecialization;
		this.staffPhoneNumber = staffPhoneNumber;
	}


	public int getStaffId() {
		return staffId;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}


	public String getStaffname() {
		return staffname;
	}


	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}


	public String getStaffspecialization() {
		return staffspecialization;
	}


	public void setStaffspecialization(String staffspecialization) {
		this.staffspecialization = staffspecialization;
	}


	public int getStaffPhoneNumber() {
		return staffPhoneNumber;
	}


	public void setStaffPhoneNumber(int staffPhoneNumber) {
		this.staffPhoneNumber = staffPhoneNumber;
	}


	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffname=" + staffname + ", staffspecialization=" + staffspecialization
				+ ", staffPhoneNumber=" + staffPhoneNumber + "]";
	}
	
	
	
	
	
}
