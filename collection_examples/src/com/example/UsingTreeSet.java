package com.example;
import java.util.*;

import com.example.model.Student;
public class UsingTreeSet {

	
	
	
	public static void print (Collection<Student> objects) {
		for(Student eachStudent: objects) {
			System.out.println(eachStudent);
		}
	}
	
	public static void main(String[] args) {

		
		Student anand = new Student(01, "Anand", 90);
		Student ben = new Student(02, "Ben", 60);
		Student cavin = new Student(03, "Cavin", 80);
		
		
		
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(anand);
		treeSet.add(ben);
		treeSet.add(cavin);
		
		print(treeSet);
	}

}
