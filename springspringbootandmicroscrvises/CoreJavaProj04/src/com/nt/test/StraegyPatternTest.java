//StraegyPatternTest.java
package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StraegyPatternTest {

	public static void main(String[] args) {
		
		//use factory pattern to target class obj
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		//invoked the b.method
		String resultMsg=fpkt.shopping(new String[] {"shit", "trouser"},
				                        new double[] {5000.0,6000.0});
		System.out.println(resultMsg);

	}

}
