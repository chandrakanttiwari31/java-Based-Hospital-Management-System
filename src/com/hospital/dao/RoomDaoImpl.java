package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hospital.pojo.Room;
import com.hospital.utility.Utility;

public   class RoomDaoImpl implements RoomDao {

	Connection con =null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	String query;
	int ans;
	
	public boolean addRoom(Room room) {

		con=Utility.establishConnection();
		query="insert into room22377(room_type) values(?)";
		try {
			ps=con.prepareStatement(query);
			ps.setString(1, room.getRoom_type());
			
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

	public List<Room> showAllRoom() {
		List<Room> l=new ArrayList<Room>();
		Room r=null;
		con=Utility.establishConnection();
		query="select * from room22377";
		try {
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();;
			while(rs.next())
			{
				r=new Room();
				r.setRoom_no(rs.getInt(1));
				r.setRoom_type(rs.getString(2));
				
				l.add(r);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}

	public List<Room> searchRoomByRoomType(String room_type) {

		List<Room> l=new ArrayList<Room>();
		Room r=null;
		con=Utility.establishConnection();
		query="select * from room22377 where room_no=?";
		try {
			ps=con.prepareStatement(query);
			ps.setString(1, room_type);
			rs=ps.executeQuery();;
			while(rs.next())
			{
				r=new Room();
				r.setRoom_no(rs.getInt(1));
				r.setRoom_type(rs.getString(2));
				
				l.add(r);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
		
		
	}

	


}
