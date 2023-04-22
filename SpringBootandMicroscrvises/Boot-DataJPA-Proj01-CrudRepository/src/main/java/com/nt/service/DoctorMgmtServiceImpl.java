//DoctorMgmtServiceImpl.java
package com.nt.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;

@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDoctorService{
	@Autowired
	private IDoctorRepo doctorRepo;
  
 	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("doc Id(before save::"+doctor.getDocId());
		Doctor doc=doctorRepo.save(doctor);
		return "Doctor obj is saved with id value : "+doc.getDocId();
		}
 
 	@Override
	public String registerGroupOfDoctors(Iterable<Doctor> doctors) {
		
		if(doctors != null) {
			Iterable<Doctor> savedDoctors=doctorRepo.saveAll(doctors);
			int size=((Collection)savedDoctors).size();
			List<Integer> ids=(List<Integer>)((Collection)savedDoctors).stream().map(d -> ((Doctor)d).getDocId()).collect(Collectors.toList());
			return size+" no.of doctors are saved with id values :: "+ids.toString();
		}
		else
			throw new IllegalArgumentException("Invlaid doctors info");
		
	}
	

	//or
  /*@Override
	public String registerGroupOfDoctors(Iterable<Doctor> doctors) {
		
		if(doctors != null) {
			Iterable<Doctor> savedDoctors=doctorRepo.saveAll(doctors);
			int size=((Collection)savedDoctors).size();
			List<Integer> ids=New ArraysList();
			savedDoctors.forEach(d -> {
				ids.add(d.getDocId());
			});
			return size+" no.of doctors are saved with id values :: "+ids.toString();
		}
		else
			thorw new IllegalArgumentException("Invlaid doctors info");
	*/	
 	@Override
 	public long fetchDoctorsCount() {
 		return doctorRepo.count();
 	}
 	
 	public boolean checkDoctorAvailibilty(Integer id) {
 		return doctorRepo.existsById(id);
 		
 	}

	@Override
	public boolean checkDoctorAvailibility(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Iterable<Doctor> showAllDoctors(){
		return doctorRepo.findAll();
	}
	
	@Override
	public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids){
		return doctorRepo.findAllById(ids);
	}
	
	@Override
	public Doctor showDoctorById(Integer id) {
		Doctor dutyDoctor=new Doctor();
		dutyDoctor.setSpecilization("duty doctor");
		Doctor doctor=doctorRepo.findById(id).orElse(dutyDoctor);
		return doctor;
	}
	
	@Override
	public String updateDoctorIncomeById(Integer id,float hikePersentage) {
		//load object
		Optional<Doctor> opt=doctorRepo.findById(id);
		if(opt.isPresent()) {
			Doctor doctor=opt.get();
			double newIncome=doctor.getIncome()+(doctor.getIncome()*(hikePersentage/100.0d));
			//set new income to Entity object
			doctor.setIncome(newIncome);
			//partially update the obejct
			return doctorRepo.save(doctor).getDocId()+"is update with "+newIncome;
		}
		else {
			return id+"doctor not found";
		}
	}
		
	@Override
	public String registerOrUpdateDoctor(Doctor doctor) {
	  //load doctor object
	  Optional<Doctor> opt=doctorRepo.findById(doctor.getDocId());
	  if(opt.isPresent()) {
		doctorRepo.save(doctor);
		return doctor.getDocId()+" Doctor deatails are found and updated ";
	   }
	   else {
		 return "Doctor is saved with id vlaue ::"+doctorRepo.save(doctor).getDocId();
	   }
	}	
	@Override	
    public String deleteDoctorById(Integer id) {
		 //load doctor object
		  Optional<Doctor> opt=doctorRepo.findById(id);
		  if(opt.isPresent()) {
			doctorRepo.deleteById(id);
			return id+" Doctor id deleted ";
		   }
		   else {
			 return id+" Doctor is not found for deletion ";
		   }
	}
	
	@Override
	public String deleteDoctor(Doctor doctor) {
		//Load object
		Optional<Doctor> opt=doctorRepo.findById(doctor.getDocId());
		if(opt.isEmpty()) {
			return doctor.getDocId()+" doctor is not found";
		}
		else {
			return doctor.getDocId()+" doctor found and deleted";
		}
	}
}
