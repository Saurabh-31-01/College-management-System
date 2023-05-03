package com.college.management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendancedetails", catalog ="collegemangement")
public class AttendanceDetails {
	
	private int id;
	private String name;
	private String attendance;
	private String branch;
	private String rollno;

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

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "AttendanceDetails [id=" + id + ", name=" + name + ", attendance=" + attendance + ", branch=" + branch
				+ ", rollno=" + rollno + "]";
	}
}
