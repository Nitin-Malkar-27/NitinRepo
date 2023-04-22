package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethodTest {
	
	public static void main(String[] args)throws Exception {
		
		//Load the java class (Dyamically at runtime)
		Class c=Class.forName(args[0]);
		Constructor cons[]=c.getDeclaredConstructors();
		//create the object for loaded class
		Object obj1=cons[0].newInstance();
		System.out.println(obj1.toString());
		Object obj2=cons[1].newInstance(10,20);
		System.out.println(obj2.toString());
	}

}
