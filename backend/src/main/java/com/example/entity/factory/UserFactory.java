package com.example.entity.factory;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

public class UserFactory {
	
	public static void GetAllUsers() {
	Session session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();

	String hql = "FROM UserEntity";
	Query query = session.createQuery(hql);
	List results =query.getResultList();
	for(Object result : results)
	System.out.println("--| result: "+result);

	// 
	session.getTransaction().commit();
	HibernateUtil.shutdown();
}
}
