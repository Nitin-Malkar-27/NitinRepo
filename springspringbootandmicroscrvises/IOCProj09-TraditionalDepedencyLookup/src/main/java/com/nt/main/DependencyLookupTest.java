//DependencyLooupTest.java
package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class DependencyLookupTest {
	
	public static void main(String[] args) {
		//Create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target spring class object
		Cricketer cktr =ctx.getBean("cktr",Cricketer.class);
		//invoke the b.methods
		System.out.println(cktr.batting());
		System.out.println(cktr.bowing());
		System.out.println(cktr.wicketKeeping());
		System.out.println(cktr.fileding());
		System.out.println("-------------------------------");
		System.out.println(cktr.batting());
		
		//close the container
		ctx.close();
	}

}
