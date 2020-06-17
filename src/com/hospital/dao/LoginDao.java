package com.hospital.dao;

public interface LoginDao {
	boolean adminLogin(String username, String password);
	boolean changeAdminPassword(String useername, String newPassword); 

}
