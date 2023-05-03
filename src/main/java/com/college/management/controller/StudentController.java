package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.StudentDetails;
import com.college.management.entity.StudentLogin;
import com.college.management.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@GetMapping("allstudentlogin")
	public List<StudentLogin> getAllStudentLogin() {
		System.out.println("In Method");
		return ss.getAllStudentLogin();
	}
	
	@PostMapping("addstudentlogin")
	public void addStudentLogin(@RequestBody StudentLogin sl) {
		ss.addStudentLogin(sl);
	}
	
	@DeleteMapping("deletestudentlogin")
	public void deleteStudentLogin(@RequestBody StudentLogin sl) {
		ss.deleteStudentLogin(sl);
	}
	
	@GetMapping("allstudentdetails")
	public List<StudentDetails> getAllStudentDetails() {
		return ss.getAllStudentDetails();
	}
	
	@PostMapping("addstudent")
	public ResponseEntity<Object> addStudentDetails(@RequestBody StudentDetails sd) {
		return ss.addStudentDetails(sd);
	}
	
	@PutMapping("updatestudent")
	public void updateStudentDetails(@RequestBody StudentDetails sd) {
		ss.updateStudentDetails(sd);
	}
	
	@DeleteMapping("deletestudent")
	public void deleteStudentDetails(@RequestBody StudentDetails sd) {
		ss.deleteStudentDetails(sd);
	}
	
	@GetMapping("startwiths")
	public List<StudentDetails> startWithS() {
		return ss.startWithS();
	}
	
	@GetMapping("marksof10thgreaterthan65")
	public List<StudentDetails> marksOf10thGreaterThan65() {
		return ss.marksOf10thGreaterThan65();
	}
	
	@GetMapping("surnamedeshmukh")
	public List<StudentDetails> surnameDeshmukh(){
		return ss.surnameDeshmukh();
	}
	
	@GetMapping("fathernamesanjay")
	public List<StudentDetails> fatherNameSanjay(){
		return ss.fatherNameSanjay();
	}
	
	@GetMapping("rollnoless13")
	public List<StudentDetails> rollNoLess30(){
		return ss.rollNoLess30();
	}
}
