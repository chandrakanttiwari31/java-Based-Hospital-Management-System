package com.hospital.pojo;

public class Room {

	
	private int room_no;
	private String room_type;
	public Room() {
		super();
	}
	public Room(int room_no, String room_type) {
		super();
		this.room_no = room_no;
		this.room_type = room_type;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	@Override
	public String toString() {
		return "Room [room_no=" + room_no + ", room_type=" + room_type + "]";
	}
	
	
	
	
}
