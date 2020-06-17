package com.hospital.dao;

import java.util.List;

import com.hospital.pojo.Doctor;



public interface DoctorDao {

	boolean addDoctor(Doctor doctor);

	boolean updateDoctor(Doctor doctor);

	boolean deleteDoctor(int dId);

	List<Doctor> showAllDoctor();

	List<Doctor> searchDoctorByDepartment(String dept);

	

	
	
	
}
