package com.example.entity.crud;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.example.entity.factory.HibernateUtil;
import com.example.entity.objects.UserEntity;

public class CriteriaExample {

	

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Criteria cr = session.createCriteria(UserEntity.class);
		List results = cr.list();
		for(Object result : results)
		System.out.println("--| result: "+result);

		// 
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}