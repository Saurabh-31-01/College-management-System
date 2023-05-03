package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.EventManagement;
import com.college.management.service.EventManagementService;

@RestController
public class EventManagementController {
	
	@Autowired
	EventManagementService ems;
	
	@GetMapping("alleventdetails")
	public List<EventManagement> getDetails(){
		return ems.getDetails();
	}
	
	@PostMapping("addnewevent")
	public void addDetails(@RequestBody EventManagement em) {
		ems.addDetails(em);
	}
	
	@PutMapping("updateevent")
	public void updateDetails(@RequestBody EventManagement em) {
		ems.updateDetails(em);
	}
	
	@DeleteMapping("deleteevent")
	public void deleteDetails(@RequestBody EventManagement em) {
		ems.deleteDetails(em);
	}
}
