package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.FeesDetails;

@Repository
public class FeesDao {
	
	@Autowired
	SessionFactory sf;
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<FeesDetails> getFeesDetails() {
		Session s = sf.openSession();
		
		Criteria cr = s.createCriteria(FeesDetails.class);
		List<FeesDetails> list = cr.list();
		
		return list;
	}

	public void updateFeesDetails(FeesDetails fd1) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(fd1 != null) {
			s.merge(fd1);
		}
		s.getTransaction().commit();
		s.close();
	}

	public void addFeesDetails(FeesDetails fd1) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(fd1 != null) {
			s.persist(fd1);
		}
		s.getTransaction().commit();
		s.close();
	}

	public void deleteFeesDetails(FeesDetails fd1) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(fd1 != null) {
			FeesDetails fd = s.load(FeesDetails.class, fd1.getId());
			
			if(fd != null) {
				s.delete(fd);
			}
		}
		
		s.getTransaction().commit();
		s.close();
		
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<FeesDetails> getStatusOfPayment() {
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		Criteria cr = ss.createCriteria(FeesDetails.class);
		cr.add(Restrictions.like("status", "pending"));
		List<FeesDetails> list = cr.list();
		
		ss.getTransaction().commit();
		return list;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<FeesDetails> getPaymentLessThan50k(){
		Session ss = sf.openSession();
		
		Criteria cr = ss.createCriteria(FeesDetails.class);
		cr.add(Restrictions.lt("paidamount", "50000"));
		List<FeesDetails> list = cr.list();
		
		return list;
	}

}
