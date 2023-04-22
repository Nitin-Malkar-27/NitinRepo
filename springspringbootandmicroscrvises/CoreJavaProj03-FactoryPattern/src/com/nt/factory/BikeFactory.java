//BikeFactory.java
package com.nt.factory;

import com.nt.comps.Bike;
import com.nt.comps.BulletBike;
import com.nt.comps.ElectricBike;
import com.nt.comps.SportBike;
import com.nt.comps.StandardBike;

public class BikeFactory {
	
	//static factory method having factory pattern logic
	public static Bike orderBike(String type) {
		Bike bike=null;
		if(type.equalsIgnoreCase("standard"))
			bike=new StandardBike();
		else if(type.equalsIgnoreCase("sports"))
			bike=new SportBike();
		else if(type.equalsIgnoreCase("electric"))
			bike=new ElectricBike();
		else if(type.equalsIgnoreCase("bullet"))
			bike=new BulletBike();
		else
			throw new IllegalArgumentException("InvalidBikeType");
		return bike;
		
	}

}
