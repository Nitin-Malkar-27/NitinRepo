package com.nt.service;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

public class DoctorMgmentServiceImpl  {//implements IDoctorMgmtService
	
@Autowired
   private IDoctorRepository doctorRepo;

   //@Override
   public Iterable<Doctor> showDoctorsByShorting(boolean asc,String ...props){
	   //prepare the Short objcect
	   Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
	   //use Repo
	   Iterable<Doctor> it=doctorRepo.findAll(sort);
	   return it;  
   }
   
   //@Override
 /*  public Page<Doctor> showDoctorsInfoByPageNo(int pageNo,int pageSize, Boolean ascOrder, String props){
	   //prepare the Sort object
	   Sort sort=Sort.by(ascOrder?Direction.ASC:Direction.DESC, props);
	   //prepare Pageable object
	   Pageable pageable=PageRequest.of(pageNo, pageSize,sort);
	   //use the repo
	   Page<Doctor> page=doctorRepo.FindAll(pageable);
	   
	   return page;	   
   }
*/
}
