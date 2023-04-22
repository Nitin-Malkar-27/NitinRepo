package com.nt.runner;

import java.util.Arrays;
import java.util.List;

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
/*		service.showDoctorsBySorting(true, "docName").forEach(System.out::println);
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
*/
		Doctor doctor=new Doctor();
		doctor.setSpecilization("cardio");
		doctor.setIncome(90000.0);
        service.showDoctorsByExampleData(doctor, true, "income").forEach(System.out::println);
	
	
	     service.showDataThrougthPagination(3);

	     System.out.println(service.deleteDoctorsByIdInBatch(List.of(678,805)));
	     System.out.println(service.deleteDoctorsByIdInBatch(List.of(678,null)));
	     System.out.println(service.deleteDoctorsByIdInBatch(Arrays.asList(16,null)));
	     
	}
	
	
}
