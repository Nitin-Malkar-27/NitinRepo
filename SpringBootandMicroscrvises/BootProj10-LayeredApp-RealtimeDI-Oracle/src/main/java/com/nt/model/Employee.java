//Employee.java
package com.nt.model;
import lombok.Data;

@Data
public class Employee {
	private Integer empno;
	private String ename;
	private String desg;
	private Double salary;
	private Double GrossSalary;
	private Double netSalary;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getGrossSalary() {
		return GrossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		GrossSalary = grossSalary;
	}
	public Double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}
	
	
}