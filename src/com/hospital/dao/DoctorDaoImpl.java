package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hospital.pojo.Doctor;
import com.hospital.utility.Utility;

public class DoctorDaoImpl implements DoctorDao {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String query;
	int ans;

	@Override
	public boolean addDoctor(Doctor doctor) {
		con = Utility.establishConnection();

		query = "insert into doctor22377 (dName,address,contact,qualification, gender,dept) values(?,?,?,?,?,?)";

		try {
			ps = con.prepareStatement(query);
			
			ps.setString(1, doctor.getdName());
			ps.setString(2, doctor.getAddress());
			ps.setLong(3, doctor.getContact());
			ps.setString(4, doctor.getQualification());
			ps.setString(5, doctor.getGander());
			ps.setString(6, doctor.getDept());
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
	public boolean updateDoctor(Doctor doctor) {

		con = Utility.establishConnection();
		query = "update doctor22377 set dName=?,address=?,contact=?,qualification=?,gender=?,dept=? where  dId=?";
		try {
			ps = con.prepareStatement(query);

			ps.setString(1, doctor.getdName());
			ps.setString(2, doctor.getAddress());
			ps.setLong(3, doctor.getContact());
			ps.setString(4, doctor.getQualification());
			ps.setString(5, doctor.getGander());
			ps.setString(6, doctor.getDept());
			ps.setInt(7, doctor.getdId());

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
	public boolean deleteDoctor(int dId) {
		con = Utility.establishConnection();
		query = "delete  from doctor22377 where dId=?";

		try {
			ps = con.prepareStatement(query);

			ps.setInt(1, dId);
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
	public List<Doctor> showAllDoctor() {
List<Doctor>l=new ArrayList<Doctor>();
Doctor d=null;
con=Utility.establishConnection();
query="select * from doctor22377";
try {
	ps=con.prepareStatement(query);
	rs=ps.executeQuery();
	while(rs.next())
	{
		
		d=new Doctor();
		d.setdId(rs.getInt(1));
		d.setdName(rs.getString(2));
		d.setAddress(rs.getString(3));
		d.setContact(rs.getLong(4));
		d.setQualification(rs.getString(5));
		d.setGander(rs.getString(6));
		d.setDept(rs.getString(7));
		l.add(d);
		
		
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


		
		
		
		return l;
	}

	@Override
	public List<Doctor> searchDoctorByDepartment(String dept) {

		List<Doctor> l=new ArrayList<Doctor>();
		Doctor d=null;
		con=Utility.establishConnection();
		query="select * from doctor22377 where dept=?";
		try {
			ps=con.prepareStatement(query);
			ps.setString(1, dept);
			rs=ps.executeQuery();
			while(rs.next())
			{
				
				d=new Doctor();
				d.setdId(rs.getInt(1));
				d.setdName(rs.getString(2));
				d.setAddress(rs.getString(3));
				d.setContact(rs.getLong(4));
				d.setQualification(rs.getString(5));
				d.setGander(rs.getString(6));
				d.setDept(rs.getString(7));
				l.add(d);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}

	

}
