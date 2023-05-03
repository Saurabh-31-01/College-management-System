package com.college.management.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.PlacementDetails;

@Repository
public class PlacementDao {

	@Autowired
	SessionFactory sf;

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<PlacementDetails> getPlacementDetails() {
		Session s = sf.openSession();

		Criteria cr = s.createCriteria(PlacementDetails.class);
		List<PlacementDetails> list = cr.list();

		return list;
	}

	public void addPlacementDetails(PlacementDetails pd2) {
		Session s = sf.openSession();
		s.beginTransaction();

		if (pd2 != null) {
			s.saveOrUpdate(pd2);
		}
		s.getTransaction().commit();
		s.close();
	}

	public void removePlacementDetails(PlacementDetails pd2) {
		Session s = sf.openSession();
		s.beginTransaction();

		if (pd2 != null) {
			PlacementDetails pd = s.load(PlacementDetails.class, pd2.getId());
			if (pd != null) {
				s.delete(pd);
			}
		}
		s.getTransaction().commit();
		s.close();
	}

	public void updatePlacementDetails(PlacementDetails pd2) {
		Session ss = sf.openSession();
		ss.beginTransaction();

		if (pd2 != null) {
			ss.merge(pd2);
		}
		ss.getTransaction().commit();
		ss.close();
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<PlacementDetails> numberOfStudentsPlacedLess25() {
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		Criteria cr = ss.createCriteria(PlacementDetails.class);
		cr.add(Restrictions.lt("noofstudentplaced", "25"));
		List<PlacementDetails> list = cr.list();
		
		ss.getTransaction().commit();
		
		return list;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<PlacementDetails> allDetailsInfosys(){
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		Criteria cr = ss.createCriteria(PlacementDetails.class);
		cr.add(Restrictions.like("companyname", "infosys"));
		
		List<PlacementDetails> list = cr.list();
		
		ss.getTransaction().commit();
		return list;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<PlacementDetails> allDetailsCapgemini(){
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		Criteria cr = ss.createCriteria(PlacementDetails.class);
		cr.add(Restrictions.like("companyname", "capgemini"));
		List<PlacementDetails> list = cr.list();
		
		ss.getTransaction().commit();
		
		return list;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<PlacementDetails> before2021(){
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		Criteria cr = ss.createCriteria(PlacementDetails.class);
		
		List<PlacementDetails> list = cr.list();
		ss.getTransaction().commit();
		
		return list;
	}
}
