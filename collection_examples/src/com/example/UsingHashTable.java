package com.example;

import java.util.*;


import com.example.model.Student;

public class UsingHashTable {

	public static void main(String[] args) {

		
		Student anand = new Student(01, "Anand", 90);
		Student ben = new Student(02, "Ben", 60);
		Student cavin = new Student(03, "Cavin", 80);
		Student cavinMan = new Student(03, "Cavin", 80);

		
		Hashtable<Integer,Student> map = new Hashtable<Integer,Student>();
		map.put(1,null);
		
		
		if(map.get(1)==null) {
			
			map.put(1,anand);
		}
		
	}

}
