package com.example.ifaces;
import com.example.*;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DoctorService implements CrudRepository<Doctor> {

	
	private ArrayList<Doctor> doctorList; 
	
	
	
	
	public DoctorService() {
		super();
	           
		doctorList=new ArrayList<Doctor>();
	}

	@Override
	public boolean add(Doctor object) {
		
		return doctorList.add(object);
	}

	@Override
	public ArrayList<Doctor> findAll() {

		return this.doctorList;
	}

	@Override
	public Doctor update(Doctor object, String revisedValue) {

		int idxPos =doctorList.indexOf(object);
		Doctor foundDoctor = doctorList.get(idxPos);
		foundDoctor.setLocation(revisedValue);
	
	return doctorList.set(idxPos,foundDoctor);
	
	}

	@Override
	public boolean remove(Doctor object) {

		return doctorList.remove(object);
	}



}
