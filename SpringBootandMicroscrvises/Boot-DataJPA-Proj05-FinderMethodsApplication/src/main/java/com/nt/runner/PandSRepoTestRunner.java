package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;
import com.nt.view.IResultView1;
import com.nt.view.IResultView2;


@Component
public class PandSRepoTestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorRepository doctorRepo;
	//InMemory poxy class object of our Repository(I) will be injected
	
	@Override
	public void run(String... args)throws Exception{
		
		Iterable<IResultView2> it=doctorRepo.findBySpecialization(List.of("cardio"));
		it.forEach(doc -> {
			//head "doc" represent InMemory Proxy class implementing IResultView(I)
			System.out.println(doc.getDocName()+"...."+doc.getIncome());
		});
		
		
		System.out.println("-----------------------------------");
		Iterable<IResultView1> it1=doctorRepo.findByIncomeBetween(50000.0, 200000.0, IResultView1.class);
		it1.forEach(data -> {
			System.out.println(data.getDocName()+"...."+data.getSpecialization());
		});
		
		System.out.println("-----------------------------------");
		Iterable<IResultView2> it2=doctorRepo.findByIncomeBetween(50000.0, 200000.0, IResultView2.class);
		it2.forEach(data -> {
			System.out.println(data.getDocName()+"...."+data.getSpecialization()+"..."+data.getIncome());
		});
	}
	//Hibernate:select d1_0.doc_name,d1_0.income from jpa_doctor_info d1_0_where d1_0.specialization in(?)
}
