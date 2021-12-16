package com.example.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ecample.utils.MarksComparator;
import com.example.ifaces.CrudRepository;
import com.example.ifaces.StudentRepository;
import com.example.model.Student;

public class StudentService implements StudentRepository<Student> {

	
	ArrayList<Student> studList; 
	
	public StudentService() {
		super();
		studList = new ArrayList();
	}

	@Override
	public boolean add(Student object) {
		return studList.add(object);
	}

	@Override
	public List<Student> findAll() {
		return this.studList;
	}

	@Override
	public Student update(Student object, double revisedValue) {
	
		
		int idxPos = studList.indexOf(object);
		Student foundStudent = studList.get(idxPos);
		foundStudent.setMarkScored(revisedValue);
	//	return foundStudent;
	return studList.set(idxPos,foundStudent);
		
	}

	@Override
	public boolean remove(Student object) {
	
		
		return studList.remove(object);
	}

	@Override
	public List<Student> getTopThreeByMark() {
		System.out.println(studList);
		ArrayList<Student> top3 =new ArrayList();
		Collections.sort(this.studList,new MarksComparator());
		for(int i=1;i<=3;i++) {
			top3.add(studList.get(i));
		}
		return top3;
		
	}

	
}
