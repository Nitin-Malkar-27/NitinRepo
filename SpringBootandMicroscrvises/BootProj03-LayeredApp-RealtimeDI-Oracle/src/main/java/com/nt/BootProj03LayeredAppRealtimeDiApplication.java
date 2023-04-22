package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollOprationasController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03LayeredAppRealtimeDiApplication {

	public static void main(String[] args) {
		
		//read the input from end user
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employee name ::");
		 String name=sc.next();
		 System.out.println("Enter Employee degs ::");
		 String degs=sc.next();
		 System.out.println("Enter Employee basicSalary ::");
		 double basicSalary=sc.nextDouble();
		 //create the Employee class object
		 Employee emp=new Employee();
		 emp.setDesg(degs);emp.setEname(name);emp.setSalary(basicSalary);
		 
		 //get IOC Containe
		 ApplicationContext ctx = SpringApplication.run(BootProj03LayeredAppRealtimeDiApplication.class, args);
		 //get Controller class object
		 PayrollOprationasController controller=ctx.getBean("payrollController",PayrollOprationasController.class);
		 //invoker the method
		 try {
			 String result=controller.processEmployee(emp);
			 System.out.println(result);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 System.out.println("Internal Problem--- Try again"+e.getMessage());
		 }
		//close the container
		 ((ConfigurableApplicationContext)ctx).close();
	}

}
