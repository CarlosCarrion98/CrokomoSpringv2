package org.bd.hibernate.config;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig <T> {
	
	private SessionFactory mySession;
	
	public HibernateConfig(T entity) {
		setMySession(new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(entity.getClass()).buildSessionFactory());
	}

	public SessionFactory getMySession() {
		return mySession;
	}

	public void setMySession(SessionFactory mySession) {
		this.mySession = mySession;
	}

}
