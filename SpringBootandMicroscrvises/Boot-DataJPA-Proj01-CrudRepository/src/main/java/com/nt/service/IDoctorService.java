//IDoctorService.java
package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorService{
	public String registerDoctor(Doctor doctor);
    public String registerGroupOfDoctors(Iterable<Doctor> doctors);
    public long fetchDoctorsCount();
    public boolean checkDoctorAvailibility(Integer id);
    public Iterable<Doctor> showAllDoctors();
    public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids);
    public Doctor showDoctorById(Integer id);
    public String updateDoctorIncomeById(Integer id,float hikePersentage);
    public String registerOrUpdateDoctor(Doctor doctor) ;
    public String deleteDoctorById(Integer id) ;
    public String deleteDoctor(Doctor doctor);
}
