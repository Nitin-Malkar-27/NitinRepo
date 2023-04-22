package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootProj02StratergyDp02Application {

	public static void main(String[] args) {
		//get IOC container
				ApplicationContext ctx=SpringApplication.run(BootProj02StratergyDp02Application.class, args);
				//target spring bean class object
				com.nt.sbeans.Vehicle vehicle=ctx.getBean("vehicle",com.nt.sbeans.Vehicle.class);
				//invoke the b.method
				vehicle.move("Pune", "Goa");
				
				//close container
				((ConfigurableApplicationContext)ctx).close();
			
	}

}
