package com.college.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.FeedbackDao;
import com.college.management.entity.FeedbackManagement;

@Service
public class FeedbackService {
	
	@Autowired
	FeedbackDao fd;
	
	public List<FeedbackManagement> getFeedback() {
		return fd.getFeedback();
	}

	public void setFeedback(FeedbackManagement fm) {
		fd.setFeedback(fm);
	}

	public void deleteFeedback(FeedbackManagement fm) {
		fd.deleteFeedback(fm);
	}

}
