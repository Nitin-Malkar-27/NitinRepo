package com.nt.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Test1Runner implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args)throws Exception {
	    System.out.println("non option ages values :: "+args.getNonOptionArgs());
	    
	    System.out.println("Option args name and Values ::");
	    for(String name:args.getOptionNames()) {
	    	System.out.println(name+"---->"+args.getOptionValues(name));
	    }
	}

}
