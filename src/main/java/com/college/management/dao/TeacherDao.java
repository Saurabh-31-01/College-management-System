package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.TeacherDetails;
import com.college.management.entity.TeacherLogin;

@Repository
public class TeacherDao {
	
	@Autowired
	SessionFactory sf;

	public void addTeacherLogin(TeacherLogin tl) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(tl != null) {
			s.saveOrUpdate(tl);
		}
		s.getTransaction().commit();
		s.close();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<TeacherLogin> getTeacherLogin() {
		Session s = sf.openSession();
		
		Criteria cr = s.createCriteria(TeacherLogin.class);
		List<TeacherLogin> list = cr.list();
		
		return list;
	}

	public void deleteTeacherLogin(TeacherLogin tl) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(tl != null) {
			TeacherLogin t = s.load(TeacherLogin.class, tl.getId());
			if(t != null) {
				s.delete(t);
			}
		}
		s.getTransaction().commit();
		s.close();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<TeacherDetails> getTeacherDetails() {
		Session s = sf.openSession();
		
		Criteria cr = s.createCriteria(TeacherDetails.class);
		List<TeacherDetails> list = cr.list();
		
		return list;
	}

	public void addTeacherDetails(TeacherDetails td2) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(td2 != null) {
			s.saveOrUpdate(td2);
		}
		
		s.getTransaction().commit();
		s.close();
	}

	public void removeTeacherDetails(TeacherDetails td2) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(td2 != null) {
			TeacherDetails t = s.load(TeacherDetails.class, td2.getId());
			if(t != null) {
				s.delete(t);
			}
		}
		
		s.getTransaction().commit();
		s.close();
	}

	public void updateTeacherDetails(TeacherDetails td2) {
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		if(td2 != null) {
			ss.merge(td2);
		}
		ss.getTransaction().commit();
		ss.close();
	}
	
	
}
