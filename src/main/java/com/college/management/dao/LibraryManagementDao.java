package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.LibraryManagement;

@Repository
public class LibraryManagementDao {

	@Autowired
	SessionFactory sf;

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<LibraryManagement> getInfo() {
		Session s = sf.openSession();
		s.beginTransaction();

		Criteria cr = s.createCriteria(LibraryManagement.class);
		List<LibraryManagement> list = cr.list();

		s.getTransaction().commit();

		return list;
	}

	public void addInfo(LibraryManagement lm) {
		Session s = sf.openSession();
		s.beginTransaction();

		s.persist(lm);

		s.getTransaction().commit();
		s.close();
	}

	public void updateInfo(LibraryManagement lm) {
		Session s = sf.openSession();
		s.beginTransaction();

		s.merge(lm);

		s.getTransaction().commit();
		s.close();
	}

	public void deleteInfo(int id) {
		Session s = sf.openSession();
		s.beginTransaction();

		LibraryManagement lm = s.get(LibraryManagement.class, id);
		if (lm != null) {
			s.delete(lm);
		}

		s.getTransaction().commit();
		s.close();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<LibraryManagement> fineGreaterThan100() {
		Session s = sf.openSession();
		s.beginTransaction();

		Criteria cr = s.createCriteria(LibraryManagement.class);
		cr.add(Restrictions.gt("fine", "100"));
		List<LibraryManagement> list = cr.list();

		s.getTransaction().commit();

		return list;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<LibraryManagement> fineLessThan50() {
		Session s = sf.openSession();
		s.beginTransaction();

		Criteria cr = s.createCriteria(LibraryManagement.class);
		List<LibraryManagement> list = cr.list();

		s.getTransaction().commit();

		return list;
	}
	
}
