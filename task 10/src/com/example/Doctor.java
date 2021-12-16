package com.example;
import java.util.*;
public class Doctor {

	private int doctorId;
	private String doctorname;
	private String specialization;
	private String location;
	
	
	
	Set<Patient> patientList;
	Map<String,Staff> staffDetails;
	public Doctor() {
		super();

	}
	public Doctor(int doctorId, String doctorname, String specialization, String location, Set<Patient> patientList,
			Map<String, Staff> staffDetails) {
		super();
		this.doctorId = doctorId;
		this.doctorname = doctorname;
		this.specialization = specialization;
		this.location = location;
		this.patientList = patientList;
		this.staffDetails = staffDetails;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Patient> getPatientList() {
		return patientList;
	}
	public void setPatientList(Set<Patient> patientList) {
		this.patientList = patientList;
	}
	public Map<String, Staff> getStaffDetails() {
		return staffDetails;
	}
	public void setStaffDetails(Map<String, Staff> staffDetails) {
		this.staffDetails = staffDetails;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorname=" + doctorname + ", specialization=" + specialization
				+ ", location=" + location + ", patientList=" + patientList + ", staffDetails=" + staffDetails + "]";
	}
	
	
	
	
	
}
