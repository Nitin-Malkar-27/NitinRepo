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



 /*  //@Override
   public Iterable<Doctor> showDoctorsByShorting(boolean asc,String ...props){
	   //prepare the Short objcect
	   Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
	   //use Repo
	   Iterable<Doctor> it=doctorRepo.findAll(sort);
	   return it;  
   }
*/  
/*
@Override
public List<Doctor> showDoctorsByExampleData(Doctor exDoctor, boolean ascOrder, String... properties) {
	//Prepare the short object
		Sort sort=Sort.by(ascOrder?Direction.ASC:Direction.DESC,properties);
		//Example object
		Example example=Example.of(example, sort);
		//user the repo
		List<Doctor> list=doctorRepo.findAll(example, sort);
		//return the Collection
		return null;
}
*/

@Override
public List<Doctor> showDoctorsByExampleData(Doctor exDoctor, boolean ascOrder, String... properties) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void showDataThrougthPagination(int pageSize) {
   //decide the page no.of pages
	long count=doctorRepo.count();
	long pagesCount=count/pageSize;
	//pagesCout=count%pageSize=0?pagesCount:++pagesCount;
	if(count%pagesCount!=0) 
		pagesCount++;
	
	for(int i=0; i<pagesCount; ++i) {
		//create Pageable object
		Pageable pageable=(Pageable) PageRequest.of(i, pageSize);
		//get each page records
		Page<Doctor> page=doctorRepo.findAll(pageable);
		System.out.println("page :: "+(page.getNumber()+1)+" records of "+page.getTotalPages());
		page.getContent().forEach(System.out::println);
		System.out.println("________________________________________________");
	}
}

@Override
public String deleteDoctorsByIdInBatch(List<Integer> ids) {
    //load the entities
	List<Doctor> list=doctorRepo.findAllById(ids);
	//delete the entities
	doctorRepo.deleteAllByIdInBatch(ids);
	return list.size()+" records are deleted";
}

@Override
public List<Doctor> showDoctorByExampleData(Doctor exDoctor, boolean ascOder, String... properties) {
    //Prepare Sort object
	Sort sort=Sort.by(ascOder?Direction.ASC:Direction.DESC,properties);
	//Example object
	Example example=Example.of(exDoctor);
	//use the repo
	List<Doctor> list=doctorRepo.findAll(example,sort);
	//return the collection
	return list;
}

@Override
public Doctor findDoctorById(Integer id) {
    //Doctor doctor=doctorRepo.getByid(id);
	Doctor doctor=doctorRepo.getReferenceById(id);
	return doctor;
}




}
