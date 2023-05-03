package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.Hostelstudentdetails;
import com.college.management.service.HostelStudentService;

@RestController
public class HostelStudentController {

	@Autowired
	HostelStudentService hss;

	@GetMapping("studentdata")
	public List<Hostelstudentdetails> getStudentData() {
		return hss.getStudentData();
	}
	
	@PostMapping("addhostelstudent")
	public void insertStundetData(@RequestBody Hostelstudentdetails hs) {
		hss.insertStundetData(hs);
	}
	
	@PutMapping("updatehostelstudent")
	public void updateStudentData(@RequestBody Hostelstudentdetails hs) {
		hss.updateStudentData(hs);
	}

	@DeleteMapping("deletestudent/{id}")
	public void deleteStudentData(@PathVariable("id") int id) {
		hss.deleteStudentData(id);
	}
	
	@GetMapping("pendingfees")
	public List<Hostelstudentdetails> getUnpaidStudents(){
		return hss.getUnpaidStudents();
	}
	
	@GetMapping("studentcomputerscience")
	public List<Hostelstudentdetails> getStudentsComputerScience(){
		return hss.getStudentsComputerScience();
	}
	
	@GetMapping("studentmechanical")
	public List<Hostelstudentdetails> getStudentsmechanical(){
		return hss.getStudentsmechanical();
	}
	
	@GetMapping("studentcivil")
	public List<Hostelstudentdetails> getStudentsCivil(){
		return hss.getStudentsCivil();
	}
	
	@GetMapping("studentelectronics")
	public List<Hostelstudentdetails> getStudentsElectronics(){
		return hss.getStudentsElectronics();
	}
	
	@GetMapping("studentelectrical")
	public List<Hostelstudentdetails> getStudentsElectrical(){
		return hss.getStudentsElectrical();
	}
}
