package com.nt.service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LinksServiceImpl implements ILinksService{

	@Override
	public String generatedWishMessage() {
		//get system date and time
		LocalDateTime ldt=LocalDateTime.now();
		//get current hours of day 
		int hours=ldt.getHour();
		if(hours<12) 
			return "good morning";
		else if(hours<16)
			return "good afternoon";
		else if(hours<20)
			return "good evening";
		else 
			return "good night";
		
	}

	@Override
	public Set<String> fetchAllLanguages() {
        Locale localse[]=Locale.getAvailableLocales();
        Set<String> langSet=new HashSet<String>();
        Locale[] locales;
		for(Locale l:localse) {
        	langSet.add(l.getDisplayLanguage());
        }
		return langSet;
	}

}
