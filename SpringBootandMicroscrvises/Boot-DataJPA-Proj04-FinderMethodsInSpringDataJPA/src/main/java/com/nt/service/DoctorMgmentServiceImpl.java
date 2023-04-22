package com.nt.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

public class DoctorMgmentServiceImpl  implements IDoctorMgmtService{
	
@Autowired
   private IDoctorRepository doctorRepo;

@Override
public List<Doctor> showDoctorsByExampleData(Doctor exDoctor, boolean ascOrder, String... properties) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void showDataThrougthPagination(int pageSize) {
	// TODO Auto-generated method stub
	
}

@Override
public String deleteDoctorsByIdInBatch(List<Integer> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Doctor> showDoctorByExampleData(Doctor exDoctor, boolean ascOder, String... properties) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Doctor findDoctorById(Integer id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object findByDocnameEquals(String string) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object findByDocnameIs(String string) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object findDoctorByDocname(String string) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object findByDocnameSartingWith(String string) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object findByDocnameEndingWith(String string) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object findbyDocnameContaining(String string) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object findDocnameEqualsIgnoreCase(String string) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object findDocnameContainingIgnoreCase(String string) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object findByDocnameLike(String string) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Iterable<Doctor> findByIncomeGreaterThanEqualAndLessThanEqual(double d, double e) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Iterable<Doctor> findBySpecializationInOrIncomeBetween(List<String> of, double d, double e) {
	// TODO Auto-generated method stub
	return null;
}








}
