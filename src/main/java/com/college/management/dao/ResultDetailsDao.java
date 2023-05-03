package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.ResultDetails;

@Repository
public class ResultDetailsDao {

	@Autowired
	SessionFactory sf;
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<ResultDetails> getResult() {
		Session s = sf.openSession();
		
		Criteria cr = s.createCriteria(ResultDetails.class);
		List<ResultDetails> list = cr.list();
		
		return list;
	}

	public void addResult(ResultDetails rd) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(rd != null) {
			s.saveOrUpdate(rd);
		}
		s.getTransaction().commit();
		s.close();
	}

	public void updateResult(ResultDetails rd) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(rd != null) {
			s.merge(rd);
		}
		s.getTransaction().commit();
		s.close();
	}

	public void deleteResult(ResultDetails rd) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(rd != null) {
			ResultDetails rd1 = s.load(ResultDetails.class, rd.getId());
			
			if(rd1 != null) {
				s.delete(rd1);
			}
		}
		
		s.getTransaction().commit();
		s.close();
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<ResultDetails> getCgpaLess9() {
		Session s = sf.openSession();
		s.beginTransaction();
		
		Criteria cr = s.createCriteria(ResultDetails.class);
		List<ResultDetails> list = cr.list();
		
		s.getTransaction().commit();
		s.close();
		
		return list;
	}
}
