package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nt.entity.Doctor;

public interface IDoctorMgmtService{

	public List<Doctor> showDoctorsByExampleData(Doctor exDoctor, boolean ascOrder, String ...properties);
	
	public void showDataThrougthPagination(int pageSize);
	
	public String deleteDoctorsByIdInBatch(List<Integer>ids);
	
	public List<Doctor> showDoctorByExampleData(Doctor exDoctor,boolean ascOder, String ...properties);
	
	public Doctor findDoctorById(Integer id);

	public Object findByDocnameEquals(String string);

	public Object findByDocnameIs(String string);

	public Object findDoctorByDocname(String string);

	public Object findByDocnameSartingWith(String string);

	public Object findByDocnameEndingWith(String string);

	public Object findbyDocnameContaining(String string);

	public Object findDocnameEqualsIgnoreCase(String string);

	public Object findDocnameContainingIgnoreCase(String string);

	public Object findByDocnameLike(String string);

	public Iterable<Doctor> findByIncomeGreaterThanEqualAndLessThanEqual(double d, double e);

	public Iterable<Doctor> findBySpecializationInOrIncomeBetween(List<String> of, double d, double e);


}

	