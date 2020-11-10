package pkg1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TestMain1 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().
										applySettings(configuration.getProperties()).getBootstrapServiceRegistry();
		SessionFactory sf = configuration.buildSessionFactory(sr);
		
		User user1 = new User();
		user1.setUserId(1);
		user1.setUserName("Arpit");
		user1.setUserMessage("Hello world from arpit");
		
		User user2 = new User();
		user1.setUserId(2);
		user1.setUserName("Ankita");
		user1.setUserMessage("Hello world from ankita");
		
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		ss.save(user1);
		ss.save(user2);
		ss.getTransaction().commit();
		ss.close();
		
	}

}
