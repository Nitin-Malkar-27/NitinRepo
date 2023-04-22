package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.service.IDoctorMgmtService;
//import com.nt.service.IDoctorService;

@SpringBootApplication
public class BootDataJpaProj04FinderMehodsInSpringJPAApplication {

	public static void main(String[] args) {
		//get IOC container
		SpringApplication.run(BootDataJpaProj04FinderMehodsInSpringJPAApplication.class, args);
		//get service class object
		//IDoctorMgmtService service=ctx.getBean("doctorService",IDoctorMgmtService.class);
	}

}
