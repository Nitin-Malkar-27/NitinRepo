package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class MethodInjectionTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get target class object ref
		BankService service=ctx.getBean("bankService",BankService.class);
		System.out.println(service.getClass()+" "+service.getClass().getSuperclass());
		//invoke the b.method
		double IntrAmt=service.calculateIntrestAmount(100000, 12, 2);
		System.out.println("Interst Amount is ::"+IntrAmt);
		
		//close container
		ctx.close();
	}

}
