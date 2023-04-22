package com.nt.main;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
        //create the IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext");
		//create locale object
		Locale locale=new Locale(args[0],args[1]);
		//get message for Locale specific or base properties file
		String msg1=ctx.getMessage("welcome.msg",new Object[] {},locale);
		String msg2=ctx.getMessage("goodbye.msg",new Object[] {},locale);
		//display the message
	    System.out.println(msg1+" "+msg2);
        
	    //close the container
	    ctx.close();
	    
	}

}

//For run this application right click on the source code of the app-->
//                          run as-->  run confg-->program arguments
//                                 hi IN
//                                           apply--> run