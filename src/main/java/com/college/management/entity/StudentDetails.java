package com.college.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentdetails", catalog ="collegemangement")
public class StudentDetails {
	
	private int id;
	private String name;
	private String fathersname;
	private String rollno;
	private String address;
	private String phone;
	private String emailId;
	private String class10th;
	private String class12th;
	private String adharno;
	private String course;
	private String branch;

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

	public String getFathersname() {
		return fathersname;
	}

	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(name = "emailid")
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getClass10th() {
		return class10th;
	}

	public void setClass10th(String class10th) {
		this.class10th = class10th;
	}

	public String getClass12th() {
		return class12th;
	}

	public void setClass12th(String class12th) {
		this.class12th = class12th;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", fathersname=" + fathersname + ", rollno=" + rollno
				+ ", address=" + address + ", phone=" + phone + ", emailid=" + emailId + ", class10th=" + class10th
				+ ", class12th=" + class12th + ", adharno=" + adharno + ", course=" + course + ", branch=" + branch
				+ "]";
	}

}
