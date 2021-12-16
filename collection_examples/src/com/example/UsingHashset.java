package com.example;
import java.util.*;


import com.example.model.Student;

public class UsingHashset {

	public static void print (Collection<Student> objects) {
		for(Student eachStudent: objects) {
			System.out.println(eachStudent);
		}
	}
	public static void main(String[] args) {

		Student anand = new Student(01, "Anand", 90);
		Student ben = new Student(02, "Ben", 60);
		Student cavin = new Student(03, "Cavin", 80);
		Student cavinMan = new Student(03, "Cavin", 80);
	    HashSet<Student> hashSet = new HashSet<Student>();
		
		
		hashSet.add(anand);
		hashSet.add(ben);
		hashSet.add(cavin);
		
		boolean isAdded =hashSet.add(cavinMan);
		System.out.println("is Added:= "+isAdded);
		print(hashSet);
		
	}

}
