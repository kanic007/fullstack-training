package com.example.model;
import java.util.*;
public class UsingHashMap {

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

		
		HashMap<Integer,Student> map = new HashMap<Integer,Student>();
		//AutoBoxing feature of java allow primitive 999 to be converted
		//to object Integer
	System.out.println(	map.put(990, anand));
	System.out.println( map.put(991, ben));
	System.out.println(	map.put(992, cavin));
	System.out.println(	map.put(992, cavinMan));

	// IT WILL return the new entry and not the old one
	// it replaces the old entry with new one
	System.out.println("From MAP"+map.get(992));
	
	
	Set<Map.Entry<Integer,Student>> setView = map.entrySet();
		
	Iterator<Map.Entry<Integer,Student>> itr =setView.iterator();	

	
	System.out.println("======Iterator======");
	while (itr.hasNext()) {
		Map.Entry<Integer,Student> eachElement =itr.next();
		System.out.println("Key:="+eachElement.getKey());
		System.out.println("Value:="+eachElement.getValue());

	}
	System.out.println("======ForEachLoop======");
	Set<Map.Entry<Integer,Student>> studSet = map.entrySet();
	
		for(Map.Entry<Integer,Student> eachStudent:studSet) {
			System.out.println("Key:="+eachStudent.getKey());
			System.out.println("Value:="+eachStudent.getValue());
		}
		
	}
	
	
	

}
