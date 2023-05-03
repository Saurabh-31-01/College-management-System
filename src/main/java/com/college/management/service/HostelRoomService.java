package com.college.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.HostelRoomDao;
import com.college.management.entity.HostelRooms;

@Service
public class HostelRoomService {
	
	@Autowired
	HostelRoomDao hrd;
	
	public List<HostelRooms> getRoomDetails(){
		return hrd.getRoomDetails();
	}
	
	public void addRoomDetails(HostelRooms hr) {
		hrd.addRoomDetails(hr);
	}
	
	public void updateRoomDetails(HostelRooms hr) {
		hrd.updateRoomDetails(hr);
	}
	
	public void deleteRoomDetails(int id) {
		hrd.deleteRoomDetails(id);
	}
	
	public List<HostelRooms> getRoomsWithEmptyBeds(){
		
		List<HostelRooms> list = hrd.getRoomsWithEmptyBeds();
		List<HostelRooms> arr = new ArrayList<>();
		
		for (HostelRooms h : list) {
			String s1 = h.getCapacity();
			String s2 = h.getNoofstudentsallocated();
			
			int a1 = Integer.parseInt(s1);
		    int a2 = Integer.parseInt(s2);
		    
		    if(a2 < a1) {
		    	arr.add(h);
		    }
		}
		
		return arr;
	}
	
	public List<HostelRooms> getUnallocatedRooms(){
		return hrd.getUnallocatedRooms();
	}
	
}
