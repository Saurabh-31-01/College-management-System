package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.HostelRooms;
import com.college.management.service.HostelRoomService;

@RestController
public class HostelRoomController {
	
	@Autowired
	HostelRoomService hrs;
	
	@GetMapping("roomdetails")
	public List<HostelRooms> getRoomDetails(){
		return hrs.getRoomDetails();
	}
	
	@PostMapping("addroomdetails")
	public void addRoomDetails(@RequestBody HostelRooms hr) {
		System.out.println(hr);
		hrs.addRoomDetails(hr);
	}
	
	@PutMapping("updateroomdetails")
	public void updateRoomDetails(@RequestBody HostelRooms hr) {
		hrs.updateRoomDetails(hr);
	}
	
	@DeleteMapping("deleteroomdetails/{id}")
	public void deleteRoomDetails(@PathVariable("id") int id) {
		hrs.deleteRoomDetails(id);
	}
	
	@GetMapping("emptybeds")
	public List<HostelRooms> getRoomsWithEmptyBeds(){
		return hrs.getRoomsWithEmptyBeds();
	}
	
	@GetMapping("unallocatedrooms")
	public List<HostelRooms> getUnallocatedRooms(){
		return hrs.getUnallocatedRooms();
	}
}
