package  com.example.backend.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.backend.entity.objects.UserEntity;



public class EntityDBWriteOneRecordTest {

	public static void RunASession() {

		SessionFactory factory = new Configuration().configure()
				.addAnnotatedClass(UserEntity.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			UserEntity user = new UserEntity("Jim","Doyle");

			session.beginTransaction();

			System.out.println("||Saving user: " + user);

			session.save(user);

			session.getTransaction().commit();
			System.out.println("Done!");

		} catch (Exception err) {
			err.printStackTrace();

		} finally {
			session.close();
			factory.close();
		}

	}

}
