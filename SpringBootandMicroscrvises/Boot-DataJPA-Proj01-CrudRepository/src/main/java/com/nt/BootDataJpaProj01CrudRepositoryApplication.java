//Client app
package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;

@SpringBootApplication
public class BootDataJpaProj01CrudRepositoryApplication {

	public static void main(String[] args) {
       
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootDataJpaProj01CrudRepositoryApplication.class, args);
		//get service class object
		IDoctorService service=ctx.getBean("doctorService",IDoctorService.class);
		
/*		try {
			//create doctor class object
			Doctor doc1=new Doctor();
			doc1.setDocName("rajesh1");doc1.setIncome(90000.0);doc1.setSpecilization("Cardio");
			Doctor doc2=new Doctor();
			doc2.setDocName("suresh1");doc2.setIncome(90000.0);doc2.setSpecilization("Physician");
			Doctor doc3=new Doctor();
			doc3.setDocName("walmiki1");doc3.setIncome(90000.0);doc3.setSpecilization("ortho");
			
			String msg=service.registerGroupOfDoctors(List.of(doc1,doc2,doc3));
			
	//	OR	String Msg=service.registerGroupOfDoctors(Arrays.asList(doc1,doc2,doc3));
			
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//close the container
		((ConfigurableApplicationContext)ctx).close();
*/
/*		try {
			System.out.println("count of records :: "+service.fetchDoctorsCount());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
*/	
/*		try {
			System.out.println("804 id doctor exisit ? :: "+service.checkDoctorAvailibility(804));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
*/
/*
		try {
			Iterable<Doctor> it=service.showAllDoctors();
			it.forEach(doc -> {System.out.println(doc);
			});
			System.out.println("__________________________________________________");
			it.forEach(doc -> System.out.println(doc));
			System.out.println("__________________________________________________");
			it.forEach(System.out::println);
			System.out.println("__________________________________________________");
			for(Doctor doc:it) {
				System.out.println(doc);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
*/	
/*		try {
			service.showAllDoctorsByIds(List.of(502,703,802,552,804)).forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
*/
/*		try {
			Doctor doctor=service.showDoctorById(803);
			System.out.println(doctor);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
*/
/*		try {
			System.out.println("804 doctor info :: "+service.showDoctorById(804));
			System.out.println(service.updateDoctorIncomeById(804, 20.0f));
			System.out.println("804 doctor info :: "+service.showDoctorById(804));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
*/
/*		
		try {
			Doctor doc=new Doctor();
			doc.setDocId(804);
			doc.setDocName("Akshada");
			doc.setIncome(90000.0);
			doc.setSpecilization("Kidny");
			System.out.println(service.registerOrUpdateDoctor(doc));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
*/
/*		try {
			System.out.println(service.deleteDoctorById(552));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
*/
		try {
		    Doctor doc=new Doctor();
		    doc.setDocId(805);
		    doc.setDocName("karan");
			System.out.println(service.deleteDoctor(doc));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
