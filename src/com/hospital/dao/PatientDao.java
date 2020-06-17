package com.hospital.dao;

import java.util.List;

import com.hospital.pojo.Patient;

public interface PatientDao {

	boolean addPatient(Patient patient);
	boolean updatePatient(Patient patient);
	
	boolean deletePatient(int pId);
	List<Patient> showAllPatint();
	List<Patient> showPatientByDiagnoses(String diagnoses);
	List<Patient> showPatientByName(String pName);
	
}
