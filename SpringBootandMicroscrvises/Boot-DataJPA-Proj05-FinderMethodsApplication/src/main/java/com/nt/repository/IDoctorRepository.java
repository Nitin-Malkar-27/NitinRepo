package com.nt.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Doctor;
import com.nt.view.IResultView2;
import com.nt.view.IView;

public interface IDoctorRepository extends JpaRepository<Doctor , Integer>{
	
	public Iterable<IResultView2> findBySpecialization(List<String> spelicals);
	
	public <T extends IView> Iterable<T> findByIncomeBetween(double start, double end, Class<T> clazz);
}
	




