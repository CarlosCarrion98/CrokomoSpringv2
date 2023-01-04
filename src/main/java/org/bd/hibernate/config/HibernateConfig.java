package org.bd.hibernate.config;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig <T> {
	
	SessionFactory mySession;
	
	public HibernateConfig(T entity) {
		mySession = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(entity.getClass()).buildSessionFactory();
		System.out.println("Todo gucci");
	}

}
