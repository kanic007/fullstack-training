package com.example;

import java.util.logging.Logger;
import java.util.*;

import com.ecample.utils.MarksComparator;
import com.ecample.utils.StudentNameComparator;
import com.example.ifaces.CrudRepository;
import com.example.ifaces.StudentRepository;
import com.example.model.Student;
import com.example.services.StudentService;

public class CrudApplication {

	public static void main(String[] args) {

		Logger logger = Logger.getAnonymousLogger();
		Student anand = new Student(01, "Anand", 90);
		Student ben = new Student(02, "Ben", 60);
		Student cavin = new Student(03, "Cavin", 80);
		Student faraz = new Student(04, "Faraz", 96);
		Student keerthana = new Student(05, "Keerthana", 94);

		StudentRepository repo = new StudentService();
		repo.add(anand);
		repo.add(ben);
		repo.add(cavin);
		repo.add(faraz);
		repo.add(keerthana);// add

		List<Student> list = repo.findAll();
		Collections.sort(list);

		// repo.updateMark(faraz, 100);
		
		//Collections.sort(list,new StudentNameComparator());
	//	Collections.sort(list,new MarksComparator());
		
		Iterator<Student> itr = repo.findAll().iterator();
		while (itr.hasNext()) {

			// System.out.println(itr.next());
			logger.info(itr.next().toString());

		}

		boolean result = repo.remove(keerthana);// remove
		if (result) {
			System.out.println("one Student Deleted");
		} else {
			throw new RuntimeException("Student doesnot Exist");
		}

		Student updated = repo.updateMark(anand, 10);
		System.out.println(updated);
		
		List<Student> top3List = repo.getTopThreeByMark();
		System.out.println("====top3=====");
//		System.out.println(top3List);
		for(Student eachStudent:top3List) {
			System.out.println(eachStudent);
		}
		
		

	}

}
