package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.Hostelstudentdetails;

@Repository
public class HostelStudentDao {

	@Autowired
	SessionFactory sf;

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Hostelstudentdetails> getStudentData() {
		Session s = sf.openSession();

		Criteria cr = s.createCriteria(Hostelstudentdetails.class);
		List<Hostelstudentdetails> list = cr.list();

		return list;
	}

	public void insertStundetData(Hostelstudentdetails hs) {
		Session s = sf.openSession();
		s.beginTransaction();

		if (hs != null) {
			s.persist(hs);
		}

		s.getTransaction().commit();
		s.close();
	}

	public void updateStudentData(Hostelstudentdetails hs) {
		Session s = sf.openSession();
		s.beginTransaction();

		if (hs != null) {
			s.merge(hs);
		}

		s.getTransaction().commit();
		s.close();
	}

	public void deleteStudentData(int id) {
		Session s = sf.openSession();
		s.beginTransaction();

		if (id != 0) {
			Hostelstudentdetails hd = s.get(Hostelstudentdetails.class, id);

			if (hd != null) {
				s.delete(hd);
			}
		}

		s.getTransaction().commit();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Hostelstudentdetails> getUnpaidStudents() {
		Session ss = sf.openSession();

		Criteria cr = ss.createCriteria(Hostelstudentdetails.class);
		cr.add(Restrictions.like("feesstatus", "pending"));
		List<Hostelstudentdetails> list = cr.list();

		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Hostelstudentdetails> getStudentsComputerScience() {
		Session ss = sf.openSession();

		Criteria cr = ss.createCriteria(Hostelstudentdetails.class);
		cr.add(Restrictions.like("department", "computer science"));
		List<Hostelstudentdetails> list = cr.list();

		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Hostelstudentdetails> getStudentsmechanical() {
		Session ss = sf.openSession();

		Criteria cr = ss.createCriteria(Hostelstudentdetails.class);
		cr.add(Restrictions.like("department", "mechanical"));
		List<Hostelstudentdetails> list = cr.list();

		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Hostelstudentdetails> getStudentsCivil() {
		Session ss = sf.openSession();

		Criteria cr = ss.createCriteria(Hostelstudentdetails.class);
		cr.add(Restrictions.like("department", "civil"));
		List<Hostelstudentdetails> list = cr.list();

		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Hostelstudentdetails> getStudentsElectronics() {
		Session ss = sf.openSession();

		Criteria cr = ss.createCriteria(Hostelstudentdetails.class);
		cr.add(Restrictions.like("department", "electronics"));
		List<Hostelstudentdetails> list = cr.list();

		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Hostelstudentdetails> getStudentsElectrical() {
		Session ss = sf.openSession();

		Criteria cr = ss.createCriteria(Hostelstudentdetails.class);
		cr.add(Restrictions.like("department", "electrical"));
		List<Hostelstudentdetails> list = cr.list();

		return list;
	}
}
