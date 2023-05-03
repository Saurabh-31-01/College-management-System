package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.AttendanceDetails;

@Repository
public class AttendanceDao {
	
	@Autowired
	SessionFactory sf;
	
	public void addAttendance(AttendanceDetails a) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(a != null) {
			s.saveOrUpdate(a);
		}
		s.getTransaction().commit();
		s.close();
	}

	public void removeAttendance(AttendanceDetails a) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(a != null) {
			AttendanceDetails ad = s.load(AttendanceDetails.class, a.getId());
			if(ad != null) {
				s.delete(ad);
			}
		}
		s.getTransaction().commit();
		s.close();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<AttendanceDetails> getAttendance() {
		Session s = sf.openSession();
		
		Criteria cr = s.createCriteria(AttendanceDetails.class);
		List<AttendanceDetails> list = cr.list();
		
		return list;
	}

	public void updateAttendance(AttendanceDetails a) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(a != null) {
			s.merge(a);
		}
		
		s.getTransaction().commit();
		s.close();
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<AttendanceDetails> getAttendanceGreater60() {
		Session s = sf.openSession();
		s.beginTransaction();
		
		Criteria cr = s.createCriteria(AttendanceDetails.class);
		cr.add(Restrictions.gt("attendance", "60%"));
		
		List<AttendanceDetails> list = cr.list();
		
		s.getTransaction().commit();
		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<AttendanceDetails> getAttendanceless80() {
		Session s = sf.openSession();
		s.beginTransaction();
		
		Criteria cr = s.createCriteria(AttendanceDetails.class);
		cr.add(Restrictions.lt("attendance", "80%"));
		List<AttendanceDetails> list = cr.list();
		
		s.getTransaction().commit();
		return list;
	}
}
