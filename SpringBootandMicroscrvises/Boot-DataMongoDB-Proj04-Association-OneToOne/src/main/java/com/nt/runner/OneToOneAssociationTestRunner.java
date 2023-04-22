package com.nt.runner;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.service.IRATMgmtService;

@Component
public class OneToOneAssociationTestRunner implements CommandLineRunner {
    @Autowired
	private IRATMgmtService ratService;
	
	@Override
	public void run(String... args) throws Exception {
        //save object using parent
		try {
		    //Parent object
			Person per=new Person();
			per.setPid(1001);
			per.setPname("Nitin");
			per.setPaddrs("Pune");
		   
			//child object
			DrivingLicense license=new DrivingLicense();
			license.setLid(new Random().nextLong(100000000000L));
		    license.setLicenseType("LMV");
		    license.setExpiryDate(LocalDate.of(2043,10,20));
		    
		    //perform Association
		    per.setLicenseDetails(license);license.setPersonDetails(per);
		    //use service
		    System.out.println(ratService.registerDrivingLicense(license));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
