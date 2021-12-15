package com.training;

public class Application {

	public static void main(String[] args) {
		
		Student ram = new Student();
		
		// can't access firstName because its marked as private
		//System.out.println(ram.firstName);
		// can access fees because its marked as default ( its package scope )
		System.out.println(ram.Fees);
	}
}
