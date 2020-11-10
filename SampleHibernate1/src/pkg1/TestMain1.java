package pkg1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class TestMain1 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().
						applySettings(configuration.getProperties())
							.buildServiceRegistry();
		
		SessionFactory sf = configuration.buildSessionFactory(sr);
	
		User user1 = new User();
		user1.setUserId(3);
		user1.setUserName("Kunal");
		user1.setUserMessage("Hello world from Kunal");
		
		User user2 = new User();
		user1.setUserId(4);
		user2.setUserName("Sarthak");
		user2.setUserMessage("Hello world from Sarthak");
		Session ss = sf.openSession();
		ss.beginTransaction();
		
		ss.save(user1);
		ss.save(user2);
		ss.getTransaction().commit();
		ss.close();
	}

}