package com.nt.conteroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {
	
	@GetMapping("/")
	public String showHomePage() {
		//return LVN (home page --welcome.jsp)
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showStudentFromPage() {
		//return LVN (from page --> student_register.jsp)
		return "student_register";
	}
	
	@PostMapping("/register")
	public String registerStudent(Map<String,Object> map,@ModelAttribute("stud")Student st) {
		
		System.out.println(st);
		//return lvn
		return "show_result";
	}
	
	
}
	/*
	  add the following properties in application.properties 
	  //application.properties
	  
	  #for ViewResolver
	  
	 
	  spring.mvc.view.prefix=/WEB-INF/pages
	  spring.mvc.view.sufix=.jsp
	  
	  #for embedded server
	  server.port=4041
	 */

