package com.example;
import java.util.*;
import com.example.model.Student;

public class UsingLinkedList {

	public static void main(String[] args) {

		
		Student anand = new Student(01,"Anand",90);
		Student ben = new Student(02,"Ben",60);
		Student cavin = new Student(03,"Cavin",80);
		
		
		LinkedList<Student> studList = new LinkedList<Student>();
		
		
		studList.add(anand);
		studList.add(ben);
		studList.add(cavin);
		
//		Iterator<Student> itr = studList.iterator();
		ListIterator<Student> itr = studList.listIterator();
		System.out.println("------ForWard Iteration--------");
		while(itr.hasNext()) {
			System.out.println(itr.next().getStudentName());
		}

//  since studList is a Linked List we can iterate on both directions next as well prevoius
		

		System.out.println("--------Backward Iteration-------");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous().getStudentName());
		}
		
	}

}
