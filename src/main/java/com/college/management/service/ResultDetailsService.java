package com.college.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.dao.ResultDetailsDao;
import com.college.management.entity.ResultDetails;

@Service
public class ResultDetailsService {
	@Autowired
	ResultDetailsDao rdd;

	public List<ResultDetails> getResult() {
		
		return rdd.getResult();
	}

	public void addResult(ResultDetails rd) {
		rdd.addResult(rd);
	}

	public void updateResult(ResultDetails rd) {
		rdd.updateResult(rd);
	}

	public void deleteResult(ResultDetails rd) {
		rdd.deleteResult(rd);
	}
	
	public List<ResultDetails> getCgpaLess9(){
		List<ResultDetails> list =  rdd.getCgpaLess9();
		List<ResultDetails> arr = new ArrayList<>();
		
		for (ResultDetails re : list) {
			String str = re.getCgpa();
			double a = Double.parseDouble(str);
			
			if(a < 9) {
				arr.add(re);
			}
		}
		
		return arr;
	}
}
