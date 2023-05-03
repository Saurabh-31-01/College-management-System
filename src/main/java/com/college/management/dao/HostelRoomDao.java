package com.college.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.management.entity.HostelRooms;

@Repository
public class HostelRoomDao {

	@Autowired
	SessionFactory sf;

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<HostelRooms> getRoomDetails() {

		Session ss = sf.openSession();
		ss.beginTransaction();

		Criteria cr = ss.createCriteria(HostelRooms.class);
		List<HostelRooms> list = cr.list();

		ss.getTransaction().commit();
		

		return list;
	}

	public void addRoomDetails(HostelRooms hr) {
		Session ss = sf.openSession();

		ss.beginTransaction();

		if(hr != null) {
			ss.persist(hr);
		}

		ss.getTransaction().commit();
		ss.close();
	}

	public void updateRoomDetails(HostelRooms hr) {
		Session ss = sf.openSession();

		ss.beginTransaction();

		if(hr != null) {
			ss.merge(hr);
		}

		ss.getTransaction().commit();
		ss.close();
	}
	
	public void deleteRoomDetails(int id) {
		Session ss = sf.openSession();

		ss.beginTransaction();

		HostelRooms hr = ss.get(HostelRooms.class, id);
		
		if(hr != null) {
			ss.delete(hr);
		}

		ss.getTransaction().commit();
		ss.close();
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<HostelRooms> getRoomsWithEmptyBeds(){
		
		Session ss = sf.openSession();
		ss.beginTransaction();

		Criteria cr = ss.createCriteria(HostelRooms.class);
		List<HostelRooms> list = cr.list();

		ss.getTransaction().commit();
		

		return list;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<HostelRooms> getUnallocatedRooms(){
		
		Session ss = sf.openSession();
		ss.beginTransaction();

		Criteria cr = ss.createCriteria(HostelRooms.class);
		cr.add(Restrictions.like("status", "unallocated"));
		List<HostelRooms> list = cr.list();

		ss.getTransaction().commit();
		
		return list;
	}
}
