package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorMgmtService;

@Component
public class PandSRepoTestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorMgmtService service;
	@Override
	public void run(String... args)throws Exception{
		service.showDoctorsBySorting(true, "docName").forEach(System.out::println);
		System.out.println("________________________________________");
		service.showDoctorsBySorting(false, "income","docName").forEach(System.out::println);
		
		
		System.out.println("------------findAll(Pageable pageable)-------------------");
		try {
			//service.showDoctorsByInfoByPageNo(1,3,true,"docName").forEach(System.out::println);
			Page<Doctor> page=service.showDoctorsInfoByPageNo(2, 3, false, "docName");
			System.out.println("page number :: "+page.getNumber());
			System.out.println("page count :: "+page.getTotalPages());
			System.out.println("it is first page :: "+page.isFirst());
			System.out.println("is it last page :: "+page.isLast());
			System.out.println("page size :: "+page.getSize());
			System.out.println("page Element count :: "+page.getNumberOfElements());
			if(!page.isEmpty()) {
				java.util.List<Doctor> list=page.getContent();
				list.forEach(System.out::println);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
