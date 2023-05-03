package com.college.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.FeesDao;
import com.college.management.entity.FeesDetails;

@Service
public class FeesService {
	
	@Autowired
	FeesDao fd;
	
	public List<FeesDetails> getFeesDetails() {
		return fd.getFeesDetails();
	}

	public void updateFeesDetails(FeesDetails fd1) {
		fd.updateFeesDetails(fd1);
	}

	public void addFeesDetails(FeesDetails fd1) {
		fd.addFeesDetails(fd1);
		
	}

	public void deleteFeesDetails(FeesDetails fd1) {
		fd.deleteFeesDetails(fd1);
	}

	public List<FeesDetails> getStatusOfPayment() {
		
		return fd.getStatusOfPayment();
	}
	
	public List<FeesDetails> getPaymentLessThan50k(){
		return fd.getPaymentLessThan50k();
	}

}
