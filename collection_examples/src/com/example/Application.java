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
	
		
     //	ObjectString rakesh = new String("Rakesh");
		
		
		studList.add(anand);
		studList.add(ben);
		studList.add(cavin);
		studList.add(faraz);
		studList.add(keerthana);
		// CAnnot add other than Student object to the studList since its a
		//typeSafe collection =. its collection of student			
		//studList.add(Rakesh);
		
		
//		System.out.println(studList.get(1));
		
		for(Student eachSudent:studList) {
			System.out.println(eachSudent);
		}
	//	 downcasting object[] to student[]
    //   to Array() method return type is object[]	
	//   but we require a student[ array , so we are doing down casting
  //		Student[] list =(Student[]) studList.toArray();
		
		Object[] list =studList.toArray();
		
		for(Object obj:list) {
			Student stud =(Student)obj;
			System.out.println(stud.getStudentName());
		}
//		Student[] studentlist = {
//				new Student(201,"Deepa",78),
//				new Student(201,"Deepa",78),
//		};
//		
////		List<Student>
//		System.out.println(list);
		
		
		
	}

}