package com.hospital.pojo;

public class OutPatient {
	private int pId;
	private String date;
	private int lab_no;
	public OutPatient() {
		super();
	}
	public OutPatient(int pId, String date, int lab_no) {
		super();
		this.pId = pId;
		this.date = date;
		this.lab_no = lab_no;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getLab_no() {
		return lab_no;
	}
	public void setLab_no(int lab_no) {
		this.lab_no = lab_no;
	}
	@Override
	public String toString() {
		return "OutPatient [pId=" + pId + ", date=" + date + ", lab_no=" + lab_no + "]";
	}
	
	
	
}



//create table outpatient (pId int(100) primary key auto_increment,date date,lab_no references lab(lab_no));