package com.training.model;

import com.training.ifaces.Conditional;

public class Students implements Conditional {

	private int id;
	private int mark;
	
	@Override
	public boolean test() {
		
		return this.mark >70;
	}

	public Students() {

	}

	public Students(int id, int mark) {
		super();
		this.id = id;
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

}
