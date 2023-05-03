package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.AdminLogin;

@Repository
public class AdminDao {

	@Autowired
	SessionFactory sf;

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<AdminLogin> getAdminLoginDetails() {
		Session s = sf.openSession();

		Criteria cr = s.createCriteria(AdminLogin.class);
		List<AdminLogin> list = cr.list();
		
		
		return list;
	}

	public void addAdminLoginDetails(AdminLogin al) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(al != null) {
			s.saveOrUpdate(al);
		}
		
		s.getTransaction().commit();
		s.close();
	}

	public void deleteAdminLoginDetails(AdminLogin al) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(al != null) {
			AdminLogin a = s.load(AdminLogin.class, al.getId());
			if(a != null) {
				s.delete(a);
			}
		}
		
		s.getTransaction().commit();
		s.close();
	}
}
