package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hospital.pojo.Patient;
import com.hospital.utility.Utility;

public class PatientDaoImpl implements PatientDao {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int ans;
	String query;

	@Override
	public boolean addPatient(Patient patient) {

		con = Utility.establishConnection();
		query = "insert into patient22377(pName,age,gender,address,contact,diagnoses,dId) values(?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(query);

			ps.setString(1, patient.getpName());
			ps.setLong(2, patient.getAge());
			ps.setString(3, patient.getGender());
			ps.setString(4, patient.getAddress());
			ps.setLong(5, patient.getContact());
			ps.setString(6, patient.getDiagnoses());
			ps.setInt(7,patient.getdId());
			ans = ps.executeUpdate();
			if (ans > 0)
				return true;
			else
				return false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updatePatient(Patient patient) {

		con = Utility.establishConnection();
		query = "update patient22377 set pName=?,age=?,gender=?,address=?,contact=?,diagnoses=? ,dId where pId=?";
		try {
			ps = con.prepareStatement(query);

			ps.setString(1, patient.getpName());
			ps.setLong(2, patient.getAge());
			ps.setString(3, patient.getGender());
			ps.setString(4, patient.getAddress());
			ps.setLong(5, patient.getContact());
			ps.setString(6, patient.getDiagnoses());
			ps.setInt(7, patient.getdId());
			ps.setInt(8, patient.getpId());

			ans = ps.executeUpdate();
			if (ans > 0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deletePatient(int pId) {

		con=Utility.establishConnection();
		query="delete from patient22377 where pId=?";
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1, pId);
			ans=ps.executeUpdate();
			if(ans>0)
			return true;
			else
				return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Patient> showAllPatint() {

		
		List<Patient> ll=new ArrayList<Patient>();
		Patient p=null;
		con=Utility.establishConnection();
		query="select * from Patient22377";
		try {
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next())
			{
				
				p=new Patient();
				p.setpId(rs.getInt(1));
				p.setpName(rs.getString(2));
				p.setAge(rs.getLong(3));
				p.setGender(rs.getString(4));
				p.setAddress(rs.getString(5));
				p.setContact(rs.getLong(6));
				p.setDiagnoses(rs.getString(7));
				
				ll.add(p);
				
				
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return ll;
	}

	@Override
	public List<Patient> showPatientByDiagnoses(String diagnoses) {
		List<Patient> ll=new ArrayList<Patient>();
		Patient p=null;
		con=Utility.establishConnection();
		query="select * from patient22377 where diagnoses=?";
		try {
			ps=con.prepareStatement(query);
			ps.setString(1, diagnoses);
			rs=ps.executeQuery();
			while(rs.next())
			{
				
				
				p=new Patient();
				p.setpId(rs.getInt(1));
				p.setpName(rs.getString(2));
				p.setAge(rs.getLong(3));
				p.setGender(rs.getString(4));
				p.setAddress(rs.getString(5));
				p.setContact(rs.getLong(6));
				p.setDiagnoses(rs.getString(7));
				
				ll.add(p);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ll;
	}

	@Override
	public List<Patient> showPatientByName(String pName) {
		List<Patient> ll=new ArrayList<Patient>();
		Patient p=null;
		con=Utility.establishConnection();
		query="select * from patient22377 where pName=?";
		try {
			ps=con.prepareStatement(query);
			ps.setString(1,pName);
			rs=ps.executeQuery();
			while(rs.next())
			{
				
				
				p=new Patient();
				p.setpId(rs.getInt(1));
				p.setpName(rs.getString(2));
				p.setAge(rs.getLong(3));
				p.setGender(rs.getString(4));
				p.setAddress(rs.getString(5));
				p.setContact(rs.getLong(6));
				p.setDiagnoses(rs.getString(7));
				
				ll.add(p);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ll;
	}

}
