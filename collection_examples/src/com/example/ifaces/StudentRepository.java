package com.example.ifaces;
import com.example.model.*;
import java.util.*;
public interface StudentRepository<T> extends CrudRepository<T>{

	List<Student> getTopThreeByMark();
	
	
}
