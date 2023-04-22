//WishMessageGenerator.java(target class) 	
package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	//HAS-A Property
	private LocalDateTime dateTime;
	
	//setter method for setter injection
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.setDateTime()");//systrace+ctrl+space gives s.o.p with message
		this.dateTime=dateTime;	
	}
	//b.method
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()");
		//get current hours of day
		int hour=dateTime.getHour();
		//generate the wish message
		if(hour<12)
			return "GoodMorning:"+user;
		else if(hour<16)
		return "GoodAfternoon:"+user;
		else if(hour<20)
			return "GoodEvening:"+user;
		else 
			return "Goodnight :"+user;
	}

}
