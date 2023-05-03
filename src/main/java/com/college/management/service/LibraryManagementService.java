package com.college.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.LibraryManagementDao;
import com.college.management.entity.LibraryManagement;

@Service
public class LibraryManagementService {

	@Autowired
	LibraryManagementDao lmd;

	public List<LibraryManagement> getInfo() {
		return lmd.getInfo();
	}

	public void addInfo(LibraryManagement lm) {
		lmd.addInfo(lm);
	}

	public void updateInfo(LibraryManagement lm) {
		lmd.updateInfo(lm);
	}

	public void deleteInfo(int id) {
		lmd.deleteInfo(id);
	}
	
	public List<LibraryManagement> fineGreaterThan100(){
		return lmd.fineGreaterThan100();
	}
	
	public List<LibraryManagement> fineLessThan50(){
		
		List<LibraryManagement> list = lmd.fineLessThan50();
		List<LibraryManagement> arr = new ArrayList<>();
		
		for (LibraryManagement li : list) {
			String str = li.getFine();
			
			int fine = Integer.parseInt(str);
			
			if(fine < 50) {
				arr.add(li);
			}
			
		}
		return arr;
	}
}
