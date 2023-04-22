//Cricketer.java
package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@Lazy(true)
public class Cricketer {
	
	public Cricketer() {
		System.out.println("Crickter::0-param construtor");
	}
	
	public String batting() {
		//create additional container 
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get dependent spring beans class object (Dependency lookup)
		CricketBat bat=ctx.getBean("cBat",CricketBat.class);
		//use dependency object
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
            