package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.PersonInfo1;

public class PropertiesFileTest {

	public static void main(String[] args) {
       //create IOC container
		 ClassPathXmlApplicationContext ctx=
				 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 System.out.println("====================================");
		  PersonInfo1 info1=ctx.getBean("plnfo1",PersonInfo1.class);
		  System.out.println(info1.toString());
		  
		  System.out.println("====================================");
		  Environment env=ctx.getEnvironment();
		  System.out.println("name:"+env.getProperty("per.name")+" "+env.getProperty("per.age")+"\n"
				          +"os.name::"+env.getProperty("os.name")+"\n Path data::"+env.getProperty("Path"));
		  
		  
		  //close container
		  ctx.close();
	}

}
