package com.college.management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "librarymanagement", catalog = "collegemangement")
public class LibraryManagement {

	private int id;
	private String bookname;
	private String studentname;
	private String dateofallocation;
	private String retrivaldate;
	private String fine;
	private String branch;
	private String rollno;
	
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getDateofallocation() {
		return dateofallocation;
	}

	public void setDateofallocation(String dateofallocation) {
		this.dateofallocation = dateofallocation;
	}

	public String getRetrivaldate() {
		return retrivaldate;
	}

	public void setRetrivaldate(String retrivaldate) {
		this.retrivaldate = retrivaldate;
	}

	public String getFine() {
		return fine;
	}

	public void setFine(String fine) {
		this.fine = fine;
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
		return "LibraryManagement [id=" + id + ", bookname=" + bookname + ", studentname=" + studentname
				+ ", dateofallocation=" + dateofallocation + ", retrivaldate=" + retrivaldate + ", fine=" + fine
				+ ", branch=" + branch + ", rollno=" + rollno + "]";
	}

}
