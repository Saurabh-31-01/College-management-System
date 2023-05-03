package com.college.management.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.college.management.dao.StudentDao;
import com.college.management.entity.StudentDetails;
import com.college.management.entity.StudentLogin;

@Service
public class StudentService {

	@Autowired
	StudentDao sd;

	public List<StudentLogin> getAllStudentLogin() {
		return sd.getAllStudentLogin();
	}

	public void addStudentLogin(StudentLogin sl) {
		sd.addStudentLogin(sl);
	}
	
	public void deleteStudentLogin(StudentLogin sl) {
		sd.deleteStudentLogin(sl);
	}
	
	public ResponseEntity<Object> addStudentDetails(StudentDetails sd2) {
		return sd.addStudentDetails(sd2);
	}

	public void updateStudentDetails(StudentDetails sd2) {
		sd.updateStudentDetails(sd2);

	}

	public List<StudentDetails> getAllStudentDetails() {
		return sd.getAllStudentDetails();
	}

	public void deleteStudentDetails(StudentDetails sd2) {
		sd.deleteStudentDetails(sd2);
	}

	public List<StudentDetails> startWithS() {
		List<StudentDetails> l = sd.startWithS();
		List<StudentDetails> l1 = new ArrayList<>();
		for (StudentDetails st : l) {
			if (Integer.parseInt(st.getRollno()) > 15 && Double.parseDouble(st.getClass12th()) > 75.0) {
				l1.add(st);
			}
		}
		return l1;
	}

	public List<StudentDetails> marksOf10thGreaterThan65() {
		List<StudentDetails> l = sd.marksOf10thGreaterThan65();
		List<StudentDetails> l1 = new ArrayList<>();

		for (StudentDetails st : l) {
			if (st.getBranch().equals("mechanical")) {
				if (st.getAddress().contains("pune")) {
					l1.add(st);
				}
			}
		}
		return l1;
	}

	public List<StudentDetails> surnameDeshmukh() {
		List<StudentDetails> l = sd.surnameDeshmukh();
		List<StudentDetails> l1 = new ArrayList<>();

		for (StudentDetails st : l) {
			if (st.getName().contains("deshmukh") && st.getBranch().equals("computer science")) {
				if (st.getAddress().contains("latur")) {
					l1.add(st);
				}
			}
		}
		return l1;
	}

	public List<StudentDetails> fatherNameSanjay() {
		List<StudentDetails> l = sd.fatherNameSanjay();
		List<StudentDetails> l1 = new ArrayList<>();

		for (StudentDetails st : l) {
			if (st.getFathersname().contains("sanjay") && st.getBranch().equals("mechanical")) {
				if (st.getAddress().contains("pune")) {
					l1.add(st);
				}
			}
		}
		return l1;
	}

	public List<StudentDetails> rollNoLess30() {
		List<StudentDetails> l = sd.rollNoLess30();
		List<StudentDetails> l1 = new ArrayList<>();

		for (StudentDetails st : l) {
			if (st.getAddress().contains("latur") && Integer.parseInt(st.getRollno()) < 13) {
				l1.add(st);
			}
		}
		return l1;
	}

}
