package com.college.management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "placementdetails", catalog = "collegemangement")
public class PlacementDetails {
	
	@Id
	private int id;
	private String companyname;
	private String date;
	private String noofstudentplaced;
	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNoofstudentplaced() {
		return noofstudentplaced;
	}

	public void setNoofstudentplaced(String noofstudentplaced) {
		this.noofstudentplaced = noofstudentplaced;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "PlacementDetails [id=" + id + ", companyname=" + companyname + ", date=" + date + ", noofstudentplaced="
				+ noofstudentplaced + ", role=" + role + "]";
	}

}
