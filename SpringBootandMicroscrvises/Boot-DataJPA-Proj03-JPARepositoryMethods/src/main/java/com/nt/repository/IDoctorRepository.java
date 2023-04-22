package com.nt.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.BootDataJpaProj03JPARepositoryMethodsApplication;
import com.nt.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor , Integer>{
               //PagingAndSortingRepository<Doctor, Integer>,CrudRepository<Doctor,Integer>{
	Page<Doctor> findAll(Pageable pageable);
	

}





