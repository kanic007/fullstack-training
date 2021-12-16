package com.example.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.*;
import com.example.ifaces.DoctorService;




public class Application {

	
	public static void main(String[] args) {

		
	// create indiviudal elements
		 
	 Patient ram = new Patient(01,"ram","chennai","dgf@.com");
	 Patient sam = new Patient(02,"sam","chennai","dgf@.com");	 
	 Patient yam = new Patient(03,"yam","chennai","dgf@.com");	 
		 
	 
	 // create a container
	 
	 HashSet<Patient> patientset = new HashSet<Patient>();
	 
	 // add elements to the container
	 
	 patientset.add(ram); 
	 patientset.add(sam);
	 patientset.add(yam);
	 
	 // create element
	 
	 Staff priya = new Staff(1,"priya","nures",12545);
	 //create container
	 
	 HashMap<String,Staff> map = new HashMap<String,Staff>();
	 
	 // add element to container
	
	 map.put("nures", priya);
	 
	
	 // add the indidviual containers to the master container 
	 
	 Doctor kanic = new Doctor (01,"kanic","MBBS","chennai", patientset,map);
	 Doctor selva = new Doctor (01,"selva","MBBS","american return", patientset,map);
	 Doctor shiva = new Doctor (01,"shiva","MBBS","andhar", patientset,map);
	 // create the service 
	 DoctorService service = new DoctorService();
	 
	 service.add(kanic);
	 service.add(selva);
	 service.add(shiva);
	 
	 
	 
	 boolean result = service.remove(shiva);// remove
		if (result) {
			System.out.println("one doctor Deleted");
		} else {
			throw new RuntimeException("doctor doesnot Exist");
		}
		
      ArrayList<Doctor> doctorList= service.findAll();//we calling findAll method 
	 
      for(Doctor eachdoctor :doctorList) {
//    	  System.out.println(eachdoctor.getDoctorname());
    	  System.out.println(eachdoctor);  
    	  
    	  for(Patient eachPatient :eachdoctor.getPatientList()) {
    		  
    		  System.out.println(eachPatient.getAddress());
    	  }
      }
      
   
      
//     for( String i:map.keySet()) {
//    	
//    		System.out.println(i.toString());
//     }
      
//      
//  	boolean result = doctorList.remove(kanic);// remove
//	if (result) {
//		System.out.println("one doctor Deleted");
//	} else {
//		throw new RuntimeException("doctor doesnot Exist");
//	}
//      
      
      
          Doctor updated = service.update(kanic,"dubai");
          System.out.println(updated);
      
	 
	}



}
