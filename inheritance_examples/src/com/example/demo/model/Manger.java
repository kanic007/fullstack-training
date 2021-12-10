package com.example.demo.model;

public class Manger extends Employee {

	private String[] skillSet;

	public Manger(int employeeid, String employeeName, String desingnation, double salary, String[] skillSet) {
		super(employeeid, employeeName, desingnation, salary);
		this.skillSet = skillSet;
	}

	public Manger() {
		super();
		
	}

	public String[] getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	
//	public String hello() {
//		return "HI";
//	}
	
	
}
