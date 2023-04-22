package com.nt.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor , Integer>{
	
	//select docId,docName,salary,specialization from doctor where docName=?
	public List<Doctor> findByDocnameEquals(String name);
	//select docId,docName,salary,specialization form doctor where docName=?
	public List<Doctor> findByDocnameIs(String name);
	//select docId,docName,salary,specialization form doctor where docName?
	public List<Doctor> findByDocname(String name);
	
	//select docId,docName,salary,specialization form doctor where docName?
	public Iterable<Doctor> findByDocnameStartingWith(String initChars);
	
	//select docId,docName,salary,specialization form doctor where docName?
	public Iterable<Doctor> findByDocnameEndingWith(String lastChars);
	
	//select docId,docName,salary,specialization form doctor where docName?
	public Iterable<Doctor> findByDocnameContaining(String chars);
	
	//select docId,docName,salary,specialization form doctor where docName?
	public Iterable<Doctor> findByDocnameEqualsIgnoreCase(String name);
	
	//select docId,docName,salary,specialization form doctor where docName?
	public Iterable<Doctor> findByDocnameEqualsContainingIgnoreCase(String chars);
	
	//select docId,docName,salary,specialization form doctor where docName'r%' //doctor with r
	//select docId,docName,salary,specialization form doctor where docName'    '//4 letter doctor
	//select docId,docName,salary,specialization form doctor where docName'%r%' //Containing letter r
	//select docId,docName,salary,specialization form doctor where docName'%r' //ending letter r
	public Iterable<Doctor> findbyDocnameLike(String chars);//pass wild chars while calling method
	
	public Iterable<Doctor> findbyIncomeGreaterThanEqualAndIncomeLessThanEqual(double startRange, double endRange);
	
	
	//finder methods with multiple properties based conditions
	
	public Iterable<Doctor> findByIncomeGreaterThanEqualAndIncomeLessThanEqual(double statRange, double endrange);
	 public Iterable<Doctor> findBySpecializationInOrIncomeBetween(List<String> specials,double start, double end);
             	

}
	




