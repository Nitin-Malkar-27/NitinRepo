//SpringBeanLifecycleTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotingElgibilityCheck;
	
public class SpringBeanLifecycleTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("______________________________________________________________________");
		VotingElgibilityCheck vec=ctx.getBean("vec",VotingElgibilityCheck.class);
		
		try {
			//invoke the b.method
			String result=vec.checkVotingElgibility();
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("______________________________________________________________________");
		//close the container
		ctx.close();

	}

}
