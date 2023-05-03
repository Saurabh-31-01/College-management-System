package com.college.management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hostelrooms", catalog = "collegemangement")
public class HostelRooms {

	private int roomno;
	private String status;
	private String capacity;
	private String noofstudentsallocated;
	
	@Id
	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getNoofstudentsallocated() {
		return noofstudentsallocated;
	}

	public void setNoofstudentsallocated(String noofstudentsallocated) {
		this.noofstudentsallocated = noofstudentsallocated;
	}

	@Override
	public String toString() {
		return "HostelRooms [roomno=" + roomno + ", status=" + status + ", capacity=" + capacity
				+ ", noofstudentsallocated=" + noofstudentsallocated + "]";
	}

}
