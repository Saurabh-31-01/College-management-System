package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.TeacherDetails;
import com.college.management.entity.TeacherLogin;
import com.college.management.service.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	TeacherService ts;
	
	@PostMapping("addteacherlogin")
	public void addTeacherLogin(@RequestBody TeacherLogin tl) {
		ts.addTeacherLogin(tl);
	}

	@GetMapping("getteacherlogin")
	public List<TeacherLogin> getTeacherLogin() {
		return ts.getTeacherLogin();
	}
	
	@DeleteMapping("deleteteacherlogin")
	public void deleteTeacherLogin(@RequestBody TeacherLogin tl) {
		ts.deleteTeacherLogin(tl);
	}

	@GetMapping("getteacherdetails")
	public List<TeacherDetails> getTeacherDetails() {
		return ts.getTeacherDetails();
	}
	
	@PostMapping("addteacherdetails")
	public void addTeacherDetails(@RequestBody TeacherDetails td) {
		ts.addTeacherDetails(td);
	}
	
	@DeleteMapping("removeteacherdetails")
	public void removeTeacherDetails(@RequestBody TeacherDetails td) {
		ts.removeTeacherDetails(td);
	}
	
	@PutMapping("updateteacherdetails")
	public void updateTeacherDetails(@RequestBody TeacherDetails td) {
		ts.updateTeacherDetails(td);
	}
}
