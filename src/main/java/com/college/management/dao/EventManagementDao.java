package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.EventManagement;

@Repository
public class EventManagementDao {
	
	@Autowired
	SessionFactory sf;
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<EventManagement> getDetails() {
		Session ss = sf.openSession();
		
		Criteria cr = ss.createCriteria(EventManagement.class);
		List<EventManagement> list = cr.list();
		
		return list;
	}
	
	public void addDetails(EventManagement em) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		if(em != null) {
			ss.persist(em);
		}
		
		ss.getTransaction().commit();
		ss.close();
	}
	
	public void updateDetails(EventManagement em) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		if(em != null) {
			ss.merge(em);
		}
		
		ss.getTransaction().commit();
		ss.close();
	}
	
	public void deleteDetails(EventManagement em) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		if(em != null) {
			EventManagement m = ss.get(EventManagement.class, em.getId());
			if(m != null) {
				ss.delete(m);
			}
		}
		
		ss.getTransaction().commit();
		ss.close();
	}
}
