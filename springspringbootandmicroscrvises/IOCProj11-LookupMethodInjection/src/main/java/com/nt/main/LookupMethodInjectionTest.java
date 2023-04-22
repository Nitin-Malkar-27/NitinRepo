//LookupMethodInjectionTest.java
package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class LookupMethodInjectionTest {
	
	public static void main(String[] args) {
		//Create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("_________________________________");
		//get Proxy class object
		Cricketer proxy =ctx.getBean("cktr",Cricketer.class);
		//invoke the b.methods
		System.out.println(proxy.batting());
		System.out.println(proxy.bowing());
		System.out.println(proxy.wicketKeeping());
		System.out.println(proxy.fileding());
		System.out.println("-------------------------------");
		System.out.println(proxy.batting());
		
		//close the container
		ctx.close();
	}

}
