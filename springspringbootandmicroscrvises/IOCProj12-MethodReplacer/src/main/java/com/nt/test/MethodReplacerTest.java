package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankOprationService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContest.xml");
	    //get target spring bean class object
		BankOprationService proxy=ctx.getBean("bankService",BankOprationService.class);
		System.out.println(proxy.getClass()+"------"+proxy.getClass().getSuperclass());
		//invoke the b.method
		try {
			double intrAmt=proxy.calculateIntrestAmount(100000.0,2.0,12.0);
			System.out.println("Interst Amount is ::"+intrAmt);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
