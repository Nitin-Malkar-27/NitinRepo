package com.nt.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StrategyDPTest {
	
	public static void main(String[] args) {
		//create IOC Container
		FileSystemXmlApplicationContext ctx=
				              new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get target Spring bean class obj
		Object obj=ctx.getBean("fpkt");
		Flipkart fpkt=(Flipkart)obj;
		//invoke the b.method
		String result=fpkt.shopping(new String[] {"shirt","trouser"},
				                        new double[] {4000.0,6000.0} );
		System.out.println(result);
		
		//close container
		ctx.close();
	}

}
