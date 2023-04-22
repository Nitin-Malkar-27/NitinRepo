package com.nt.service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

public class DoctorMgmtServiceImpl implements IDoctorService{
   private IDoctorRepository doctorRepo;
   
//   public void DocorMgmtServiceImpl() {
//	   doctorRepo=new IDoctorRepository();
//   }

   @Override
   public Doctor searchDoctorByNameDocName(String docName) {
       Doctor doc=doctorRepo.showDoctorInfoByName(docName).orElseThrow(()->new IllegalArgumentException("Doctor not found"));
	   return doc;
   }

   @Override
   public Object searchDoctorDataByName(String docName) {
	  Object obj=doctorRepo.showDoctorDataByName(docName);
	  return obj;
   }

   @Override
   public String searchSpecializationByName(String docName) {
	  String string=doctorRepo.showSpecializationByName(docName);
	  return string;
    }
	
   

}
