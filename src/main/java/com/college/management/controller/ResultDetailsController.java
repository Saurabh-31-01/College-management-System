package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.ResultDetails;
import com.college.management.service.ResultDetailsService;

@RestController
public class ResultDetailsController {
	
	@Autowired
	ResultDetailsService rds;
	
	@GetMapping("getresult")
	public List<ResultDetails> getResult() {
		return rds.getResult();
	}
	
	@PostMapping("addresult")
	public void addResult(@RequestBody ResultDetails rd) {
		rds.addResult(rd);
	}
	
	@PutMapping("updateresult")
	public void updateResult(@RequestBody ResultDetails rd) {
		rds.updateResult(rd);
	}
	
	@DeleteMapping("deleteresult")
	public void deleteResult(@RequestBody ResultDetails rd) {
		rds.deleteResult(rd);
	}
	
	@GetMapping("cgpaless9")
	public List<ResultDetails> getCgpaLess9(){
		return rds.getCgpaLess9();
	}
}
