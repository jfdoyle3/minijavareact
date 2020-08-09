package com.example.backend.main;

import java.util.List;

import org.hibernate.Session;

import com.example.backend.data.UserData;
import com.example.backend.data.UserEntityData;
import com.example.backend.entity.objects.UserEntity;
import com.example.backend.objects.User;

public class TestHibernate {

	

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		List<UserEntity> users=UserEntityData.UserEntityList();
		for (UserEntity user: users)
		session.save(user);

		// 
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}