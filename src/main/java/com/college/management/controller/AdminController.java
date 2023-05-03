package com.college.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.college.management.service.AdminService;
import com.college.management.entity.AdminLogin;

@RestController
public class AdminController {

	@Autowired
	AdminService as;

	@GetMapping("getadminlogin")
	public List<AdminLogin> getAdminLoginDetails() {
		return as.getAdminLoginDetails();
	}

	@PostMapping("insertadminlogin")
	public void addAdminLoginDetails(@RequestBody AdminLogin al) {
		as.addAdminLoginDetails(al);
	}

	@DeleteMapping("deleteadminlogin")
	public void deleteAdminLoginDetails(@RequestBody AdminLogin al) {
		as.deleteAdminLoginDetails(al);
	}
}
