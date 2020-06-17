package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hospital.pojo.InPatient;
import com.hospital.utility.Utility;

public class InPatientDaoImpl  implements InPatientDao{
	
	
	
	Connection con;
	 ResultSet rs;
	 int ans;
	 PreparedStatement ps;
	String query;

	@Override
	public boolean addInPatient(InPatient inpatient) {

		con=Utility.establishConnection();
		query="insert into inpatient(date-adm,date-dis,room_no,lan_no) values(?,?,?,?) ";
		try {
			ps=con.prepareStatement(query);
			ps.setString(1, inpatient.getDate_adm());
			ps.setString(2,inpatient.getDate_dis());
			ps.setInt(3, inpatient.getRoom_no());
			ps.setInt(4, inpatient.getLab_no());
			
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
	public List<InPatient> showAllInPatient() {

		List<InPatient> l=new ArrayList<InPatient>();
		InPatient in=null;
		
		
		con=Utility.establishConnection();
		query="select * from inpatient";
		try {
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next())
			{
				
				in=new InPatient();
				
				in.setDate_adm(rs.getString(1));
				in.setDate_dis(rs.getString(2));
				in.setRoom_no(rs.getInt(3));
				in.setLab_no(rs.getInt(4));
				
				l.add(in);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}

	@Override
	public List<InPatient> searchInPatientById(int pId) {
		List<InPatient> l=new ArrayList<InPatient>();
		InPatient in=null;
		
		
		con=Utility.establishConnection();
		query="select * from inpatient where pId=?";
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1, pId);
			rs=ps.executeQuery();
			while(rs.next())
			{
				
				in=new InPatient();
				in.setpId(rs.getInt(1));
				in.setDate_adm(rs.getString(2));
				in.setDate_dis(rs.getString(3));
				in.setRoom_no(rs.getInt(4));
				in.setLab_no(rs.getInt(5));
				
				l.add(in);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}

}
