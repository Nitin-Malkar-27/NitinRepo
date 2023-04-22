package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service("doctorService")
public class DoctorServiceMgmtImpl implements IDoctorManagementService{
   @Autowired
   private EntityManager manager;

@Override
public List<Doctor> showDoctorsByIncomeRange(double start, double end) {
    //create StoredProcedureQuery object pointing PL/SQL procedure
	StoredProcedureQuery query=manager.createStoredProcedureQuery("P_GET_DOCTORS_BY_INCOME_RANGE",Doctor.class);
	//register both IN, OUT params by specifying their made
    query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
    query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
    query.registerStoredProcedureParameter(3, Double.class, ParameterMode.REF_CURSOR);
    //set values to IN params
    query.setParameter(1, start);
    query.setParameter(2, end);
    //call PL/SQL procedure
    List<Doctor> list=query.getResultList();
    
	return list;
}
	

}
