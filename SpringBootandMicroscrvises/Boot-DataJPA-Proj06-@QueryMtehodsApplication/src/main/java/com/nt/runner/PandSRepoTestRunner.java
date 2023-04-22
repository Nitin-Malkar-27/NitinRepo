package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Component
public class PandSRepoTestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorRepository service;
	//InMemory poxy class object of our Repository(I) will be injected
	
	@Override
	public void run(String... args)throws Exception{
		
		System.out.println("==============================================");
		Doctor doctor=service.showDoctorInfoByName("raja");
		System.out.println("Doctor Info :: "+doctor);
		
		System.out.println("__________________________________________________");
		Object obj=service.showDoctorDataByName("raja");
		Object data[]=(Object[])obj;
		for(Object o:data) {
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.println("Result is :: "+Arrays.toString(data));
		System.out.println("__________________________________________________");
        String result=service.showSpecializationByName("raja");
        System.out.println("Specialization is :: "+result);
		
	}
	//Hibernate:select d1_0.doc_name,d1_0.income from jpa_doctor_info d1_0_where d1_0.specialization in(?)
}
