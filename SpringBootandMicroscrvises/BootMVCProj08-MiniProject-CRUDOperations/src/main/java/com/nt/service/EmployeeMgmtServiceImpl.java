package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepository;


@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService{
    @Autowired
    private IEmployeeRepository empRepo;
    
	@Override
	public Iterable<Employee> getAllEmployees() {
		return empRepo.findAll();
		
	}

	@Override
	public String registerEmployee(Employee emp) {
		return "employee is saved with id value:"+empRepo.save(emp).getEmpno();
	}
	
	@Override
	public Employee getEmployeeByNo(int eno) {
		Employee emp = empRepo.findById(eno).orElseThrow(()->new IllegalArgumentException());
		return emp;
	}
	
	@Override
	pubilc String updateEmployee(Employee emp) {
		return "Employee is Updated with having id value ::"+empRepo.save(emp).getEmpNo();
	}
	
	@Override
	public String deleteEmployeeById(int eno) {
		
		empRepo.deleteById(eno);
			return eno+" employee id Employee id deleted";
	}

}