//Controller class
package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller("payrollContoller")
public class PayrollOprationasController {
	@Autowired
	private IEmployeeMgmtService service;
	
	public String processEmployee(Employee emp)throws Exception{
		//delegation the request to Service class
		String result=service.registerEmployee(emp);
				return result;
	}
	

}
