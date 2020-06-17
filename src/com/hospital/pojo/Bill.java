package com.hospital.pojo;

public class Bill {
  
	
	private int bill_no;
	private int pId;
	private String patient_type;
	private long doctor_charge;
	private long medical_charge;
	private long room_charge;
	private long operation_charge;
	private int no_of_days;
	private  long nursing_charge;
	private long lab_chaarge;
	private long total_bill;
	private String date;
	public Bill() {
		super();
	}
	public Bill(int bill_no, int pId, String patient_type, long doctor_charge, long medical_charge, long room_charge,
			long operation_charge, int no_of_days, long nursing_charge, long lab_chaarge, long total_bill,
			String date) {
		super();
		this.bill_no = bill_no;
		this.pId = pId;
		this.patient_type = patient_type;
		this.doctor_charge = doctor_charge;
		this.medical_charge = medical_charge;
		this.room_charge = room_charge;
		this.operation_charge = operation_charge;
		this.no_of_days = no_of_days;
		this.nursing_charge = nursing_charge;
		this.lab_chaarge = lab_chaarge;
		this.total_bill = total_bill;
		this.date = date;
	}
	public int getBill_no() {
		return bill_no;
	}
	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPatient_type() {
		return patient_type;
	}
	public void setPatient_type(String patient_type) {
		this.patient_type = patient_type;
	}
	public long getDoctor_charge() {
		return doctor_charge;
	}
	public void setDoctor_charge(long doctor_charge) {
		this.doctor_charge = doctor_charge;
	}
	public long getMedical_charge() {
		return medical_charge;
	}
	public void setMedical_charge(long medical_charge) {
		this.medical_charge = medical_charge;
	}
	public long getRoom_charge() {
		return room_charge;
	}
	public void setRoom_charge(long room_charge) {
		this.room_charge = room_charge;
	}
	public long getOperation_charge() {
		return operation_charge;
	}
	public void setOperation_charge(long operation_charge) {
		this.operation_charge = operation_charge;
	}
	public int getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	public long getNursing_charge() {
		return nursing_charge;
	}
	public void setNursing_charge(long nursing_charge) {
		this.nursing_charge = nursing_charge;
	}
	public long getLab_chaarge() {
		return lab_chaarge;
	}
	public void setLab_chaarge(long lab_chaarge) {
		this.lab_chaarge = lab_chaarge;
	}
	public long getTotal_bill() {
		return total_bill;
	}
	public void setTotal_bill(long total_bill) {
		this.total_bill = total_bill;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Bill [bill_no=" + bill_no + ", pId=" + pId + ", patient_type=" + patient_type + ", doctor_charge="
				+ doctor_charge + ", medical_charge=" + medical_charge + ", room_charge=" + room_charge
				+ ", operation_charge=" + operation_charge + ", no_of_days=" + no_of_days + ", nursing_charge="
				+ nursing_charge + ", lab_chaarge=" + lab_chaarge + ", total_bill=" + total_bill + ", date=" + date
				+ "]";
	}
	
	
}


/* 

 create table bill(bill_no int(100) primary key auto_increment, pId int(100) references patient22377(pId),
patient_type varchar(100), doctor_charge long,mediacal_charge long,romm_charge long,operation_charge long,no_of_days int(100),
nursing_charge long,lab_charge long,total_bill long,date date);    

*/