package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.AttendanceDetails;
import com.college.management.service.AttendanceService;

@RestController
public class AttendanceController {
	
	@Autowired
	AttendanceService as;
	
	@PostMapping("addAttendance")
	public void addAttendance(@RequestBody AttendanceDetails a) {
		as.addAttendance(a);
	}
	
	@DeleteMapping("removeattendance")
	public void removeAttendance(@RequestBody AttendanceDetails a) {
		as.removeAttendance(a);
	}
	
	@GetMapping("getAttendance")
	public List<AttendanceDetails> getAttendance() {
		return as.getAttendance();
	}
	
	@PutMapping("updateAttendance")
	public void updateAttendance(@RequestBody AttendanceDetails a) {
		as.updateAttendance(a);
	}
	
	@GetMapping("attendancegreaterthan60")
	public List<AttendanceDetails> getAttendanceGreater60(){
		return as.getAttendanceGreater60();
	}
	
	@GetMapping("attendanceless80frommechanical")
	public List<AttendanceDetails> getAttendanceless80(){
		return as.getAttendanceless80();
	}
}
