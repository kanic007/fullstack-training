package com.example.ifaces;

import com.example.model.*;
import java.util.*;

public interface CrudRepository<T> {

	public boolean add(T object);
	public List<T> findAll();
	public Student updateMark(T object , double revisedMark);
	public boolean remove(T object);
	
	
}

