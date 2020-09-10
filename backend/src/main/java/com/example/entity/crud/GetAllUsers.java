package com.example.entity.crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.backend.objects.User;
import com.example.entity.factory.HibernateUtil;

public class GetAllUsers {
	private static SessionFactory factory;

	public static void startFactory() {
	      try {
	         factory = new Configuration().configure().buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	}

	public static List<User> AllUsers() {
		List<User> allUsers=new ArrayList<User>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		String hql = "FROM UserEntity";
		Query query = session.createQuery(hql);
		List<User> results =query.getResultList();
		for(User result : results) {
		System.out.println("--| result: "+result);
		allUsers.add(result);
		}
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
		return allUsers;
	}
	
}