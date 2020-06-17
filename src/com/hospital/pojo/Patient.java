package com.hospital.pojo;

public class Patient {

	
	private int pId;
	private String pName;
	private long age;
	private String gender;
	private String address;
	private long contact;
	private  String diagnoses;
	private int dId;
	public Patient() {
		super();
	}
	public Patient(int pId, String pName, long age, String gender, String address, long contact, String diagnoses,
			int dId) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.contact = contact;
		this.diagnoses = diagnoses;
		this.dId = dId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getDiagnoses() {
		return diagnoses;
	}
	public void setDiagnoses(String diagnoses) {
		this.diagnoses = diagnoses;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", pName=" + pName + ", age=" + age + ", gender=" + gender + ", address="
				+ address + ", contact=" + contact + ", diagnoses=" + diagnoses + ", dId=" + dId + "]";
	}
	
	
	
	
}





//create table patient22377 (pId int (50) primary key auto_increment,pName varchar(100),age long,gender varchar(100),address varchar(200),contact long ,diagnoses varchar(200), room_no int reference room22377(room_no));





