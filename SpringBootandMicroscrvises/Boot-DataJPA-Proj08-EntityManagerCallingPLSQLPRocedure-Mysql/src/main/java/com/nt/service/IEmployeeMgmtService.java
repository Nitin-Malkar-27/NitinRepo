package com.nt.service;

import java.util.List;

public interface IEmployeeMgmtService {
	public List<Employee_Info> showEmployeeBySalaryRange(double start,double end);

}
