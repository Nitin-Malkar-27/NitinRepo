//IDoctorRepo.java
package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import com.nt.entity.Doctor;

import lombok.Data;

public interface IDoctorRepo extends CrudRepository<Doctor, Integer> {

	
}
