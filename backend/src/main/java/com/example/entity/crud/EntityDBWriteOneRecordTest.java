package  com.example.entity.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity.objects.User;



public class EntityDBWriteOneRecordTest {

	public static void RunASession() {

		SessionFactory factory = new Configuration().configure()
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			User user = new User("Jim","Doyle");

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
