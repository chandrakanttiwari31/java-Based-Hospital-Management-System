package com.hospital.dao;

import java.util.List;

import com.hospital.pojo.InPatient;

public interface InPatientDao {

	boolean addInPatient(InPatient inpatient);
	List<InPatient> showAllInPatient();
	List<InPatient> searchInPatientById(int pId);
}
