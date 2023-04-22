package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorMgmtService;

@Component
public class PandSRepoTestRunner implements CommandLineRunner {
	@Autowired
	//private IDoctorMgmtService service;
	private IDoctorMgmtService doctorRepo;
	
	@Override
	public void run(String... args)throws Exception{
		//==================finder methods===================
 /*       service.findByDocnameEquals("raja").forEach(System.out::println);
        System.out.println("__________________________________________");
	    service.findByDocnameIs("rahul").forEach(System.out::println);
	    System.out.println("__________________________________________");
	    service.findDoctorByDocname("ram").forEach(System.out::println);
	    System.out.println("___________________________________________");
	    service.findByDocnameSartingWith("ra").forEach(System.out::println);
	    System.out.println("__________________________________________");
	    service.findByDocnameEndingWith("a").forEach(System.out::println);
	    
	    System.out.println("___________________________________________");
	    service.findbyDocnameContaining("j").forEach(System.out::println);
	    
	    System.out.println("____________________________________________");
	    service.findDocnameEqualsIgnoreCase("raj").foEach(System.out::println);
	    
	    System.out.println("_____________________________________________");
	    service.findDocnameContainingIgnoreCase("r").forEach(System.out::println);
	    
	    System.out.println("______________________________________________");
	    //service.findByDocnameLike("r%").forEach(System.out::println); //or
	    //service.findByDocnameLike("__").forEach(System.out::println); //or
	    //service.findByDocnameLike("%r").forEach(System.out::println); //or
	    service.findByDocnameLike("%r%").forEach(System.out::println); 
*/	    
/*	    Iterable<Doctor> it=doctorRepo.findByIncomeGreaterThanEqualAndLessThanEqual(50000.0 , 200000.0);
	    it.forEach(System.out::println);
	
*/
		
	Iterable<Doctor> it=doctorRepo.findByIncomeGreaterThanEqualAndLessThanEqual(50000.0, 200000.0);
	  it.forEach(System.out::println);
	  
	  System.out.println("-------------------------------------");
	//  doctorRepo.findBySpecializationInOrIncomeBetween(List.of("cardio","physician"),3000.0, 7000.0).forEach(System.out::println);
	}
}
