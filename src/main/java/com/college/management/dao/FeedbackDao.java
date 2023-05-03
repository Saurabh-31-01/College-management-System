package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.FeedbackManagement;

@Repository
public class FeedbackDao {

	@Autowired
	SessionFactory sf;
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<FeedbackManagement> getFeedback() {
		Session s = sf.openSession();
		s.beginTransaction();
		
		Criteria cr = s.createCriteria(FeedbackManagement.class);
		List<FeedbackManagement> list = cr.list();
		
		return list;
	}

	public void setFeedback(FeedbackManagement fm) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(fm != null) {
			s.saveOrUpdate(fm);
		}
		
		s.getTransaction().commit();
		s.close();
	}

	public void deleteFeedback(FeedbackManagement fm) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(fm != null){
			FeedbackManagement fm1 = s.load(FeedbackManagement.class, fm.getId());
			if(fm1 != null) {
				s.delete(fm1);
			}
		}
		
		s.getTransaction().commit();
		s.close();
	}
}
