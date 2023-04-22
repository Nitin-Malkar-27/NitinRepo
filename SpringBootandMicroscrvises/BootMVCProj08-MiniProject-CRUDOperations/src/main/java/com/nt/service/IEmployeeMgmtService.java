package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {

	public Iterable<Employee> getAllEmployees();
	public String registerEmployee(Employee emp);
	public Employee getEmployeeByNo(int eno);
	public String updateEmpoyee(Employee emp);
	public String deleteEmployeeById(int eno);
}
