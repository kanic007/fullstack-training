package com.example;

public class Patient {

	
	private int patientId;
	private String Patientname;
	private String address;
	private String email;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientname, String address, String email) {
		super();
		this.patientId = patientId;
		Patientname = patientname;
		this.address = address;
		this.email = email;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientname() {
		return Patientname;
	}
	public void setPatientname(String patientname) {
		Patientname = patientname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", Patientname=" + Patientname + ", address=" + address + ", email="
				+ email + "]";
	}
	
	
	
	
	
}
