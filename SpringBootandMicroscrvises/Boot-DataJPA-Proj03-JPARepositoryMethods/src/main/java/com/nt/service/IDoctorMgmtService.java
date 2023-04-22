package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nt.entity.Doctor;

public interface IDoctorMgmtService{
//	//one method can have only one var args param that last one param method 
//	//var args are internally arrays..
//	public Iterable<Doctor> showDoctorsBySorting(boolean asc, String ...props);
//	
//	public Page<Doctor> showDoctorsInfoByPageNo(int pageNo,int pageSize,boolean ascOrder,String props);
	
	public List<Doctor> showDoctorsByExampleData(Doctor exDoctor, boolean ascOrder, String ...properties);
	
	public void showDataThrougthPagination(int pageSize);
	
	public String deleteDoctorsByIdInBatch(List<Integer>ids);
	
	public List<Doctor> showDoctorByExampleData(Doctor exDoctor,boolean ascOder, String ...properties);
	
	public Doctor findDoctorById(Integer id);
}

	