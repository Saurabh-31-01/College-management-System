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

import com.college.management.entity.LibraryManagement;
import com.college.management.service.LibraryManagementService;

@RestController
public class LibraryManagementController {

	@Autowired
	LibraryManagementService lms;

	@GetMapping("getbookrecord")
	public List<LibraryManagement> getInfo() {
		return lms.getInfo();
	}
	@PostMapping("addbookrecords")
	public void addInfo(@RequestBody LibraryManagement lm) {
		lms.addInfo(lm);
	}

	@PutMapping("updatebookrecords")
	public void updateInfo(@RequestBody LibraryManagement lm) {
		lms.updateInfo(lm);
	}

	@DeleteMapping("deletebookrecords/{id}")
	public void deleteInfo(@PathVariable("id") int id) {
		lms.deleteInfo(id);
	}
	
	@GetMapping("finegreaterthan100")
	public List<LibraryManagement> fineGreaterThan100(){
		return lms.fineGreaterThan100();
	}
	
	@GetMapping("finelessthan50")
	public List<LibraryManagement> fineLessThan50(){
		return lms.fineLessThan50();
	}
}
