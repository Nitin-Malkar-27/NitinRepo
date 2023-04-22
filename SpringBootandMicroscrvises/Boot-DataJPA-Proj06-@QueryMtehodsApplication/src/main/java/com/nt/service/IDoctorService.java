package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorService {
	public Doctor searchDoctorByNameDocName(String docName);
	
	public Object searchDoctorDataByName(String docName);
	
	public String searchSpecializationByName(String docName);

}
