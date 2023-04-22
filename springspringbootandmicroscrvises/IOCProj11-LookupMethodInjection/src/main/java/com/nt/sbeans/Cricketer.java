//Cricketer.java
package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
public abstract class Cricketer {
	
	public Cricketer() {
		System.out.println("Crickter::0-param construtor");
	}
	
	//@Lookup("cBat")
	@Lookup
	public abstract CricketBat getBat();
	
	//special method
	public String batting() {
		//get dependent class object (internally uses of IOC container dependency lookup container code of proxy class)
		CricketBat bat=getBat();
		//use dependent class object
		int runs=bat.scoreRuns();
		return "Crickter is batting on :: "+bat.scoreRuns()+" runs";
	}
	
	public String bowing() {
		return "Crickter is bowling";
	}  
	
	public String wicketKeeping() {
		return "Crickter is keeping the wickets";
	}
	
	public String fileding() {
		return "Crickter is filding the ball";
	}
}
            