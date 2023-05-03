package com.college.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.PlacementDao;
import com.college.management.entity.PlacementDetails;

@Service
public class PlacementService {

	@Autowired
	PlacementDao pd;

	public List<PlacementDetails> getPlacementDetails() {
		return pd.getPlacementDetails();
	}

	public void addPlacementDetails(PlacementDetails pd2) {
		pd.addPlacementDetails(pd2);
	}

	public void removePlacementDetails(PlacementDetails pd2) {
		pd.removePlacementDetails(pd2);
	}

	public void updatePlacementDetails(PlacementDetails pd2) {
		pd.updatePlacementDetails(pd2);
	}
	
	public List<PlacementDetails> numberOfStudentsPlacedLess25() {
		return pd.numberOfStudentsPlacedLess25();
	}
	
	public List<PlacementDetails> allDetailsInfosys(){
		return pd.allDetailsInfosys();
	}
	
	public List<PlacementDetails> allDetailsCapgemini(){
		return pd.allDetailsCapgemini();
	}
	
	public List<PlacementDetails> before2021(){
		List<PlacementDetails> list = pd.before2021();
		
		List<PlacementDetails> arr = new ArrayList<>();
		for (PlacementDetails pl : list) {
			String str = pl.getDate();
			String ptr = str.substring(str.length()- 2, str.length());
			
			int a = Integer.parseInt(ptr);
			
			if(a < 21) {
				arr.add(pl);
			}
		}
		return arr;
	}
}
