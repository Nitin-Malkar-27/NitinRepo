package com.nt.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.BootDataJpaProj01PagingAndShortingRepositoryApplication;
import com.nt.entity.Doctor;

public interface IDoctorRepository extends PagingAndSortingRepository<Doctor, Integer> {

}
