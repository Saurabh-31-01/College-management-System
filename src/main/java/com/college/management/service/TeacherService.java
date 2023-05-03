package com.college.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.TeacherDao;
import com.college.management.entity.TeacherDetails;
import com.college.management.entity.TeacherLogin;

@Service
public class TeacherService {
	
	@Autowired
	TeacherDao td;

	public void addTeacherLogin(TeacherLogin tl) {
		td.addTeacherLogin(tl);
	}

	public List<TeacherLogin> getTeacherLogin() {
		return td.getTeacherLogin();
	}

	public void deleteTeacherLogin(TeacherLogin tl) {
		td.deleteTeacherLogin(tl);
	}

	public List<TeacherDetails> getTeacherDetails() {
		return td.getTeacherDetails();
	}

	public void addTeacherDetails(TeacherDetails td2) {
		td.addTeacherDetails(td2);
	}

	public void removeTeacherDetails(TeacherDetails td2) {
		td.removeTeacherDetails(td2);
	}

	public void updateTeacherDetails(TeacherDetails td2) {
		td.updateTeacherDetails(td2);
	}
}
