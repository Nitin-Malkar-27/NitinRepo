package com.nt.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProj02StrategyDpApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj02StrategyDpApplication.class, args);
		//target spring bean class object
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invoke the b.method
		vehicle.move("Pune", "Goa");
		
		//close container
		((ConfigurableApplicationContext)ctx).close();
	}

}
