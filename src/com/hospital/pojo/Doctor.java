package com.hospital.pojo;

public class Doctor {
	
	private int dId;
	private String dName;
	private String address;
	private long contact;
	private String qualification;
	private String gander;
	private String  dept;
	public Doctor() {
		super();
	}
	public Doctor(int dId, String dName, String address, int contact, String qualification, String gander,
			String dept) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.address = address;
		this.contact = contact;
		this.qualification = qualification;
		this.gander = gander;
		this.dept = dept;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long l) {
		this.contact = l;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getGander() {
		return gander;
	}
	public void setGander(String gander) {
		this.gander = gander;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Doctor [dId=" + dId + ", dName=" + dName + ", address=" + address + ", contact=" + contact
				+ ", qualification=" + qualification + ", gander=" + gander + ", dept=" + dept + "]";
	}
	
	
	
	

}




//create table doctor22377 (dId int(20) primary key auto_increment,dName varchar(100),address varchar(100),contact long,qualification varchar(100),gender varchar(100));
