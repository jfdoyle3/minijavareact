package com.example.entity.test;

import java.util.List;

import org.hibernate.Session;

import com.example.backend.data.UserData;
import com.example.backend.data.UserEntityData;
import com.example.backend.objects.User;
import com.example.entity.factory.HibernateUtil;
import com.example.backend.objects.User;

public class TestHibernate {

	

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		List<com.example.entity.objects.User> users=UserEntityData.UserEntityList();
		for (com.example.entity.objects.User user: users)
		session.save(user);

		// 
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}