//StratergyDPTest.java
package com.nt.test;

import java.sql.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class StratergyDPTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//invoked the b.method
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
            //invoked.the b.method
				String result=fpkt.shopping(new String[] {"shirt","touser"},
			                                     new double[] {4000.0,6000.0});
		System.out.println(result);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Date d1=ctx.getBean("java.util.Date",Date.class);
		System.out.println(d1.hashCode());
		Date d2=ctx.getBean("java.util.Date#0",Date.class);
		System.out.println(d2.hashCode());
		
		Date d3=ctx.getBean("java.util.Date#1",Date.class);
		System.out.println(d3.hashCode());
		
		//close container
		ctx.close();
	}

}
