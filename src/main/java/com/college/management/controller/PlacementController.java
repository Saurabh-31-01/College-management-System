package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.PlacementDetails;
import com.college.management.service.PlacementService;

@RestController
public class PlacementController {

	@Autowired
	private PlacementService ps;

	@GetMapping("getplacememtdetails")
	public List<PlacementDetails> getPlacementDetails() {
		return ps.getPlacementDetails();
	}

	@PostMapping("addplacementdetails")
	public void addPlacementDetails(@RequestBody PlacementDetails pd) {
		ps.addPlacementDetails(pd);
	}

	@DeleteMapping("deleteplacementdetails")
	public void removePlacementDetails(@RequestBody PlacementDetails pd) {
		ps.removePlacementDetails(pd);
	}

	@PutMapping("updateplacementdetails")
	public void updatePlacementDetails(@RequestBody PlacementDetails pd) {
		ps.updatePlacementDetails(pd);
	}
	
	@GetMapping("placedlessthan25")
	public List<PlacementDetails> numberOfStudentsPlacedLess25(){
		return ps.numberOfStudentsPlacedLess25();
	}
	
	@GetMapping("infosysdetails")
	public List<PlacementDetails> allDetailsInfosys(){
		return ps.allDetailsInfosys();
	}
	
	@GetMapping("capgeminidetails")
	public List<PlacementDetails> allDetailsCapgemini(){
		return ps.allDetailsCapgemini();
	}
	
	@GetMapping("before2021")
	public List<PlacementDetails> before2021(){
		return ps.before2021();
	}
}
