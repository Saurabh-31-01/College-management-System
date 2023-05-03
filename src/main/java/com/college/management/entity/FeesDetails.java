package com.college.management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feesdetails", catalog = "collegemangement")
public class FeesDetails {
	
	private int id;
	private String name;
	private String paidamount;
	private String status;
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

	public String getPaidamount() {
		return paidamount;
	}

	public void setPaidamount(String paidamount) {
		this.paidamount = paidamount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "FeesDetails [id=" + id + ", name=" + name + ", paidamount=" + paidamount + ", status=" + status
				+ ", branch=" + branch + "]";
	}

}
