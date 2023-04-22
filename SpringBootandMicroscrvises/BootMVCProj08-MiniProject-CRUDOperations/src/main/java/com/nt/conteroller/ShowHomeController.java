package com.nt.conteroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentOperationsController {
	
	@RequestMapping("/home")
	public String showhome() {
		//return LVN
		return "welcome";
	}

	
	/*
	  add the following properties in application.properties 
	  //application.properties
	  
	  #Embedded server port (default is 8080)
	  server.port=4041
	  
	  #ViewResolver input(prefix,suffix)for default InternalResourceViewResolver
	  spring.mvc.view.prefix=/WEB-INF/pages
	  spring.mvc.view.sufix=.jsp
	 */

}
