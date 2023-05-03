package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.FeesDetails;
import com.college.management.service.FeesService;

@RestController
public class FeesController {
	
	@Autowired
	FeesService fs;
	
	@GetMapping("getfeesdetails")
	public List<FeesDetails> getFeesDetails() {
		return fs.getFeesDetails();
	} 
	
	@PutMapping("updatefeesdetails")
	public void updateFeesDetails(@RequestBody FeesDetails fd) {
		fs.updateFeesDetails(fd);
	}
	
	@PostMapping("addfeesdetails")
	public void addFeesDetails(@RequestBody FeesDetails fd) {
		fs.addFeesDetails(fd);
	}
	
	@DeleteMapping("deletefeesdetails")
	public void deleteFeesDetails(@RequestBody FeesDetails fd) {
		fs.deleteFeesDetails(fd);
	}
	
	@GetMapping("statuspayment")
	public List<FeesDetails> getStatusOfPayment() {
		return fs.getStatusOfPayment();
	}
	
	@GetMapping("paymentless50k")
	public List<FeesDetails> getPaymentLessThan50k(){
		return fs.getPaymentLessThan50k();
	}
}
