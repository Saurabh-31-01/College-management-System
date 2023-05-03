package com.college.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.HostelStudentDao;
import com.college.management.entity.Hostelstudentdetails;

@Service
public class HostelStudentService {
	
	@Autowired
	HostelStudentDao hsd;
	
	public List<Hostelstudentdetails> getStudentData(){
		return hsd.getStudentData();
	}
	
	public void insertStundetData(Hostelstudentdetails hs) {
		hsd.insertStundetData(hs);
	}
	
	public void updateStudentData(Hostelstudentdetails hs) {
		hsd.updateStudentData(hs);
	}
	
	public void deleteStudentData(int id) {
		hsd.deleteStudentData(id);
	}
	
	public List<Hostelstudentdetails> getUnpaidStudents(){
		return hsd.getUnpaidStudents();
	}

	public List<Hostelstudentdetails> getStudentsComputerScience() {
		return hsd.getStudentsComputerScience();
	}

	public List<Hostelstudentdetails> getStudentsmechanical() {
		return hsd.getStudentsmechanical();
	}

	public List<Hostelstudentdetails> getStudentsCivil() {
		return hsd.getStudentsCivil();
	}

	public List<Hostelstudentdetails> getStudentsElectronics() {
		return hsd.getStudentsElectronics();
	}

	public List<Hostelstudentdetails> getStudentsElectrical() {
		return hsd.getStudentsElectrical();
	}
}
