package com.nt.conteroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeOprationsController{
	@Autowired
	private IEmployeeMgmtService empService;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String, Object> map) {
		//use service
		Iterable<Employee> itEmps=empService.getAllEmployees();
		//put result in model attribute
		map.put("empsList",itEmps);
		//return LVN
		return "show_employee_report";
	}
	
	@GetMapping("/emp_add")//for form launching
	public String showFormForsaveEmployee(@ModelAttribute("emp")Employee emp) {
		//return LVN
		return "register_employee";
	}
	
	@PostMapping("/emp_add")//form submission realated to add employee opration
	public String saveEmployee(@ModelAttribute("emp")Employee emp,Map<String, Object> map) {
		
		//use service
		String msg=empService.registerEmployee(emp);
		Iterable<Employee> itEmps=empService.getAllEmployees();
		//keep the result in ModelAttribute
		map.put("resultMsg", msg);
		map.put("empsList", itEmps);
		//return LVN
		return "show_employee_report";
	}
	
	@PostMapping("/emp_add")//form submission realated to add employee opration
	public String saveEmployee(@ModelAttribute("emp")Employee emp,
			                                           RedirectAttributes attrs) {
		System.out.println("EmployeeOprationsController.saveEmployee()");	
		//use service
		String msg=empService.registerEmployee(emp);
		//keep the result in ModelAttribute
		attrs.addFlashAttribute("resultMsg",msg);
		
		//return LVN
		return "show_employee_report";
	}
	
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String, Object> map) {
		
		System.out.println("EmployeeOprationsController.showEmployeeReport()");
		//use service
		Iterable<Employee> itEmps=empService.getAllEmployees();
		//put result in model attribute
		map.put("empsList",itEmps);
		//return LVN
		return "show_employee_report";
	}
	
	@PostMapping("/emp_add")//form submission realated to add employee opration
	public String saveEmployee(@ModelAttribute("emp")Employee emp,
			                                           HttpSession ses) {
		System.out.println("EmployeeOprationsController.saveEmployee()");	
		//use service
		String msg=empService.registerEmployee(emp);
		//keep the result in ModelAttribute
		ses.setAttribute("resultMsg", msg);
		
		//return LVN
		return "show_employee_report";
	}
	
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String, Object> map) {
		System.out.println("EmployeeOprationsController.showEmployeeReport()");
		//use service
		Iterable<Employee> itEmps=empService.getAllEmployees();
		//put result in model attribute
		map.put("empsList",itEmps);
		//return LVN
		return "show_employee_report";
	}
	
	@GetMapping("/emp_edit")
	public String showEditEmployeeFromPage(@RequestParam("no")int no,
			                               @ModelAttribute("emp")Employee emp) {
		//use service
		Employee emp1 =empService.getEmployee.getEmployeeByNo(no);
		//copy data
		BeanUtil.copyProperties(emp1,emp);
		//return LVN
		return "update_employee";
	}
	
	@PostMapping("/emp_edit")
	public String editEmployee(RedirectAttributes attrs,
			                      @ModelAttribute("emp")Employee emp) {
		//use service
		String msg=empService.updateEmployee(emp);
		//add result msg as flash Attribute
		attrs.addFlashAttribute("resultMsg",msg);
		//redirect the redirect
		return "redirect:emp_report";
	}
	
	@PostMapping("/emp_delete")
	public String editEmployee(RedirectAttributes attrs,
			                       @RequestParam int no) {
		//use service
		String msg=empService.deleteEmployeeById(no);
		//keep result in flash Attribute
		attrs.addFlashAttribute("resultMsg",msg);
		//redirect the redirect
		return "redirect:emp_report";
	}
}