package com.example.ifaces;

import java.util.*;

import com.example.Doctor;

public interface CrudRepository<T> {

	public boolean add(T object);
	public ArrayList<Doctor> findAll();
	public T update(T object , String revisedValue);
	public boolean remove(T object);
	
	
}

