package com.pkg1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductDao {
	public void saveProduct(Product product) {
		Transaction transaction = null;
		try(Session session = ProductUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			session.save(product);
			
			transaction.commit();
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	public List<Product> getProducts(){
		try(Session session = ProductUtil.getSessionFactory().openSession()){
			return session.createQuery("from Product", Product.class).list();
		}
	}
}
