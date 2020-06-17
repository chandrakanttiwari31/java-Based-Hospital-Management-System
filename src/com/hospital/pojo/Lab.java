package com.hospital.pojo;

public class Lab {
	
	private int lab_no;
	private int pId;
	private int dId;
	private String date;
	private String patient_type;
	private long amount;
	public Lab() {
		super();
	}
	public Lab(int lab_no, int pId, int dId, String date, String patient_type, long amount) {
		super();
		this.lab_no = lab_no;
		this.pId = pId;
		this.dId = dId;
		this.date = date;
		this.patient_type = patient_type;
		this.amount = amount;
	}
	public int getLab_no() {
		return lab_no;
	}
	public void setLab_no(int lab_no) {
		this.lab_no = lab_no;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPatient_type() {
		return patient_type;
	}
	public void setPatient_type(String patient_type) {
		this.patient_type = patient_type;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Lab [lab_no=" + lab_no + ", pId=" + pId + ", dId=" + dId + ", date=" + date + ", patient_type="
				+ patient_type + ", amount=" + amount + "]";
	}
	
	

}


//create table lab(lab_no int(100) primary key auto_increment,pId int(100) references patient22377(pId),dId int(100) references doctor22377(dId),date date,patient_type varchar(100),amount long);
