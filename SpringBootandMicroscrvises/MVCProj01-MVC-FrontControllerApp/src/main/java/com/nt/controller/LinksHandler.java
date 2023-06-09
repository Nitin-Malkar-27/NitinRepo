//LinksHandler.java
package com.nt.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.nt.service.ILinksService;
import com.nt.service.LinksServiceImpl;

public class LinksHandler {
	private ILinksService service;
	
	public LinksHandler() {
		service=new LinksServiceImpl();
	}
	
	//Handler method1
	public String showWishMessage(HttpServletRequest req) {
		//use service
		String resultMsg=service.generatedWishMessage();
		//keep result in request scope
		req.setAttribute("wmsg", resultMsg);
		//return logical view name(LVN)based which physical
		//jps file name and location will be decided
		return "wish_result";
		
	}
	
	public String showAllLanguages(HttpServletRequest req) {
		//use service
		Set<String> langSet=service.fetchAllLanguages();
		//Keep result in request scope
		req.setAttribute("langInfo", langSet);
		//return LVN
		return "all_alng";
	}

}
