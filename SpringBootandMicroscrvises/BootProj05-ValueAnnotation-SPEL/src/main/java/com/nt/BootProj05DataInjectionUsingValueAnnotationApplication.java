package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.PatientInfo;

@SpringBootApplication
public class BootProj05DataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj05DataInjectionUsingValueAnnotationApplication.class, args);
	    //get PateintInfo Spring bean class object
		PatientInfo info=ctx.getBean("PInfo" , PatientInfo.class);
		System.out.println(info);
		
		//close the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
