package com.example;

import java.util.*;

import com.example.model.*;
public class Application {

	public static void main(String[] args) {

		
		ArrayList<Student> studList = new ArrayList();
		
		Student anand = new Student(01,"Anand",90);
		Student ben = new Student(02,"Ben",60);
		Student cavin = new Student(03,"Cavin",80);
		Student faraz = new Student(04,"Faraz",96);
		Student keerthana = new Student(05,"Keerthana",94);
	
		
//		String rakesh = new String("Rakesh");
		
		
		studList.add(anand);
		studList.add(ben);
		studList.add(cavin);
		studList.add(faraz);
		studList.add(keerthana);
		// CAnnot add othe than Student object to the studList since its a
		//typesafe collection =. its collection of studen			
		//studList.add(Rakesh);
		
		
//		System.out.println(studList.get(1));
		
		for(Student eachSudent:studList) {
			System.out.println(eachSudent);
		}

	}

}