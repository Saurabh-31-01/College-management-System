package com.college.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.EventManagementDao;
import com.college.management.entity.EventManagement;

@Service
public class EventManagementService {
	
	@Autowired
	EventManagementDao emd;
	
	public List<EventManagement> getDetails(){
		return emd.getDetails();
	}
	
	public void addDetails(EventManagement em) {
		emd.addDetails(em);
	}
	
	public void updateDetails(EventManagement em) {
		emd.updateDetails(em);
	}
	
	public void deleteDetails(EventManagement em) {
		emd.deleteDetails(em);
	}
}
