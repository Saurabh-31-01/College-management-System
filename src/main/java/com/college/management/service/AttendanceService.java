package com.college.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.AttendanceDao;
import com.college.management.entity.AttendanceDetails;

@Service
public class AttendanceService {
	
	@Autowired
	AttendanceDao ad;
	
	public void addAttendance(AttendanceDetails a) {
		ad.addAttendance(a);
	}

	public void removeAttendance(AttendanceDetails a) {
		ad.removeAttendance(a);
	}

	public List<AttendanceDetails> getAttendance() {
		return ad.getAttendance();
	}

	public void updateAttendance(AttendanceDetails a) {
		ad.updateAttendance(a);
	}
	
	public List<AttendanceDetails> getAttendanceGreater60(){
		return ad.getAttendanceGreater60();
	}

	public List<AttendanceDetails> getAttendanceless80() {
		List<AttendanceDetails> li = ad.getAttendanceless80();
		
		List<AttendanceDetails> arr = new ArrayList<>();
		
		for (AttendanceDetails at : li) {
			if(at.getBranch().equals("mechanical")) {
				arr.add(at);
			}
		}
		
		return arr;
	}
	
	public List<AttendanceDetails> getAttendanceOfComputerScience(){
		return ad.getAttendanceOfComputerScience();
	}
}
