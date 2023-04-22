package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Customer;

@SpringBootApplication
public class BootProj07YmlApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj07YmlApplication.class, args);
		//get Employee obj ref
		Customer emp=ctx.getBean("cust",Customer.class);
		//display the object data
		System.out.println(emp);
		
		//close the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
