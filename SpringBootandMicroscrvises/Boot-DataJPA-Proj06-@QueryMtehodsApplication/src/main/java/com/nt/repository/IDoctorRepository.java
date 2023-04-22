package com.nt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Doctor;


public interface IDoctorRepository extends JpaRepository<Doctor , Integer>{
     
	//---------------Entity Query giving single records-------------------
	@Query("FROM DOCTOR where docname=:name")//asume that doctor
	public Doctor  showDoctorInfoByName(String name);

	//---------------Scalar Query giving single record multiple col values-------------------
	@Query("FROM docId,docName FROM Doctor where docName=:name")//asume that doctor
	public Object showDoctorDataByName(String name);
	
	//---------------Scalar Query giving single record single col values-------------------
	@Query("SELECT specialization FROM Doctor docName=:name")//asume that doctor
	public String showSpecializationByName(String name);
	
}
	




