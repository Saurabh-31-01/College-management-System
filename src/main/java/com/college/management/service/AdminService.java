package com.college.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.AdminDao;
import com.college.management.entity.AdminLogin;

@Service
public class AdminService {
	
	@Autowired
	AdminDao ad;

	public List<AdminLogin> getAdminLoginDetails() {
		return ad.getAdminLoginDetails();
	}

	public void addAdminLoginDetails(AdminLogin al) {
		ad.addAdminLoginDetails(al);
	}

	public void deleteAdminLoginDetails(AdminLogin al) {
		ad.deleteAdminLoginDetails(al);
	}
	
	
}
