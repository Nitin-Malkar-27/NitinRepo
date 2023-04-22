//Client application
package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("SetterInjectionTest");
		// create IOC container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("applicationContext.xml");
		// set target spring bean class object 
		Object obj = ctx.getBean("wmg");
		//type casting
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		// invoke the b.method
		String result = generator.showWishMessage("raja");
		// display the result
		System.out.println(result);

		// close the container
		ctx.close();

		System.out.println("SetterInjectionTest.main()(end)");

	}

}
 