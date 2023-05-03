package com.college.management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hostelstudentdetails", catalog = "collegemangement")
public class Hostelstudentdetails {

	private int id;
	private String name;
	private String mobileno;
	private String emailid;
	private String department;
	private String feesstatus;
	private String roomno;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFeesstatus() {
		return feesstatus;
	}

	public void setFeesstatus(String feesstatus) {
		this.feesstatus = feesstatus;
	}

	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	@Override
	public String toString() {
		return "hostelstudentdetails [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", emailid=" + emailid
				+ ", department=" + department + ", feesstatus=" + feesstatus + ", roomno=" + roomno + "]";
	}

}
