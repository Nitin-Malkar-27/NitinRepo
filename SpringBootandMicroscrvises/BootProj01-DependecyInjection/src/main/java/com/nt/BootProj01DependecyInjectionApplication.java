package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootProj01DependecyInjectionApplication {

	public static void main(String[] args) {

		//get IOC container
		ApplicationContext ctx = SpringApplication.run(BootProj01DependecyInjectionApplication.class);
		//get target Spring	bean class object
	    SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
		//invoke the b.method
	    String seasonName=finder.findSeason();
	    System.out.println("Season Name :: "+seasonName);
	    
	    //close the IOC container
	    ((ConfigurableApplicationContext)ctx).close();
	    
	}

}
