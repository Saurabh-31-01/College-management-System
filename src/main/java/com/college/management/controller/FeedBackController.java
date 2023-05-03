package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.FeedbackManagement;
import com.college.management.service.FeedbackService;

@RestController
public class FeedBackController {
	
	@Autowired
	FeedbackService fs;
	
	@GetMapping("getfeedback")
	public List<FeedbackManagement> getFeedback() {
		return fs.getFeedback();
	}
	
	@PostMapping("setfeedback")
	public void setFeedback(@RequestBody FeedbackManagement fm) {
		fs.setFeedback(fm);
	}
	
	@DeleteMapping("deletefeedback")
	public void deleteFeedback(@RequestBody FeedbackManagement fm) {
		fs.deleteFeedback(fm);
	}
}
