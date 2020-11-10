package pkg1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {   //Data Access Objects
	public void saveStudent(Student student) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			session.save(student);
			
			transaction.commit();
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	public List<Student> getStudents(){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.createQuery("from Student", Student.class).list();
		}
	}
}
