package com.hospital.dao;

import java.sql.*;

import com.hospital.utility.Utility;

public class LoginDaoImpl implements LoginDao {

	
	
	Connection con =null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	String pass;
	String query;
	int ans;
	@Override
	public boolean adminLogin(String username, String password) {
  con=Utility.establishConnection();
  query="select password from login where username=?";
  try {
	ps=con.prepareStatement(query);
	ps.setString(1, username);
	
	rs=ps.executeQuery();
	if(rs.next())
	{
		
		pass=rs.getString(1);
	}
	if(password.equals(pass))
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
	public boolean changeAdminPassword(String username, String newPassword) {

		con=Utility.establishConnection();
		query="update login set password=? where username=?";
		try {
			ps=con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, newPassword);
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

}
