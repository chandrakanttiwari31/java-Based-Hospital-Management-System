package com.hospital.pojo;

public class InPatient {

	
	private int pId;
	private int room_no;
	private String date_adm;
	private String date_dis;
	private int lab_no;
	public InPatient() {
		super();
	}
	public InPatient(int pId, int room_no, String date_adm, String date_dis, int lab_no) {
		super();
		this.pId = pId;
		this.room_no = room_no;
		this.date_adm = date_adm;
		this.date_dis = date_dis;
		this.lab_no = lab_no;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getDate_adm() {
		return date_adm;
	}
	public void setDate_adm(String date_adm) {
		this.date_adm = date_adm;
	}
	public String getDate_dis() {
		return date_dis;
	}
	public void setDate_dis(String date_dis) {
		this.date_dis = date_dis;
	}
	public int getLab_no() {
		return lab_no;
	}
	public void setLab_no(int lab_no) {
		this.lab_no = lab_no;
	}
	@Override
	public String toString() {
		return "InPatient [pId=" + pId + ", room_no=" + room_no + ", date_adm=" + date_adm + ", date_dis=" + date_dis
				+ ", lab_no=" + lab_no + "]";
	}
	
	
}


//create table inpatient(pId int(100) primary key auto_increment,date_adm date ,date_dis,room_no int(100) references room22377(room_no),lan_no int(100) references lab(lab_no));
