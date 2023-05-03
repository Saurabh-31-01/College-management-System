package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.college.management.entity.StudentDetails;
import com.college.management.entity.StudentLogin;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory sf;

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<StudentLogin> getAllStudentLogin() {

		Session s = sf.openSession();
		s.beginTransaction();

		Criteria cr = s.createCriteria(StudentLogin.class);
		List<StudentLogin> list = cr.list();

		return list;
	}

	public void addStudentLogin(StudentLogin sl) {
		Session s = sf.openSession();
		s.beginTransaction();

		if (sl != null) {
			s.saveOrUpdate(sl);
		}

		s.getTransaction().commit();
		s.close();
	}
	
	public void deleteStudentLogin(StudentLogin sl) {
		Session s = sf.openSession();
		s.beginTransaction();
		
		if(sl != null) {
			StudentLogin ss = s.load(StudentLogin.class, sl.getId());
			if(ss != null) {
				s.delete(ss);
			}
		}
		s.getTransaction().commit();
		s.close();
	}

	public ResponseEntity<Object> addStudentDetails(StudentDetails sd2) {
		Session s = sf.openSession();
		s.beginTransaction();

		if (sd2 == null) {
			return ResponseEntity.notFound().build();
		}
		s.save(sd2);

		s.getTransaction().commit();
		s.close();

		return null;
	}

	public void updateStudentDetails(StudentDetails sd2) {
		Session s = sf.openSession();
		s.beginTransaction();

		if (sd2 != null) {
			s.merge(sd2);
		}

		s.getTransaction().commit();
		s.close();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<StudentDetails> getAllStudentDetails() {
		Session s = sf.openSession();
		s.beginTransaction();

		Criteria cr = s.createCriteria(StudentDetails.class);
		List<StudentDetails> list = cr.list();

		s.getTransaction().commit();

		return list;
	}

	public void deleteStudentDetails(StudentDetails sd2) {
		Session s = sf.openSession();
		s.beginTransaction();

		if (sd2 != null) {
			StudentDetails s1 = s.load(StudentDetails.class, sd2.getId());
			if (s1 != null) {
				s.delete(s1);
			}
		}

		s.getTransaction().commit();
		s.close();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<StudentDetails> startWithS() {
		Session s = sf.openSession();

		Criteria cr = s.createCriteria(StudentDetails.class);
		cr.add(Restrictions.like("name", "s%"));
		List<StudentDetails> list = cr.list();
		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<StudentDetails> marksOf10thGreaterThan65() {
		Session s = sf.openSession();

		Criteria cr = s.createCriteria(StudentDetails.class);
		cr.add(Restrictions.gt("class10th", "65"));
		List<StudentDetails> list = cr.list();

		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<StudentDetails> surnameDeshmukh() {
		Session s = sf.openSession();

		Criteria cr = s.createCriteria(StudentDetails.class);
		List<StudentDetails> list = cr.list();

		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<StudentDetails> fatherNameSanjay() {
		Session s = sf.openSession();

		Criteria cr = s.createCriteria(StudentDetails.class);
		cr.add(Restrictions.gt("class10th", "60"));
		List<StudentDetails> list = cr.list();

		return list;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<StudentDetails> rollNoLess30() {
		Session s = sf.openSession();

		Criteria cr = s.createCriteria(StudentDetails.class);
		List<StudentDetails> list = cr.list();
		return list;
	}

}
