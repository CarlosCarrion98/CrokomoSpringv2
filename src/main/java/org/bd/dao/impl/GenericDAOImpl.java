package org.bd.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bd.dao.GenericDAO;
import org.bd.hibernate.config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.*;


public class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {

	HibernateConfig<T> hc;

	private final static Logger LOGGER = Logger.getLogger(GenericDAOImpl.class.getName());

	public GenericDAOImpl() {
		hc = new HibernateConfig<T>(null);
	}

	@Override
	public void saveOrUpdate(T entity) {
		Session session = hc.getMySession().getCurrentSession();
		try {
			session.beginTransaction();
			session.persist(entity);
			session.getTransaction().commit();
		} catch (javax.validation.ConstraintViolationException cve) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
		} catch (org.hibernate.exception.ConstraintViolationException cve) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
		} catch (RuntimeException ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
			throw ex;
		} catch (Exception ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
			throw new RuntimeException(ex);
		}
	}

	@Override
	public T get(ID id) {
		T entity = null;
		Session session = hc.getMySession().getCurrentSession();
		try {
			session.beginTransaction();
			entity = (T) session.get(getEntityClass(), id);
			session.getTransaction().commit();

			
		} catch (javax.validation.ConstraintViolationException cve) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
		} catch (org.hibernate.exception.ConstraintViolationException cve) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
		} catch (RuntimeException ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
			throw ex;
		} catch (Exception ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
			throw new RuntimeException(ex);
		}
		return entity;
	}

	@Override
	public void delete(ID id)  {
		Session session = hc.getMySession().getCurrentSession();
		try {
			session.beginTransaction();
			T entity = (T) session.get(getEntityClass(), id);
			if (entity == null) {
				return;
			}
			session.remove(entity);
			session.getTransaction().commit();
		} catch (javax.validation.ConstraintViolationException cve) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
		} catch (org.hibernate.exception.ConstraintViolationException cve) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
		} catch (RuntimeException ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
			throw ex;
		} catch (Exception ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
			throw new RuntimeException(ex);
		}
	}

	@Override
	public List<T> findAll() {
		Session session = hc.getMySession().getCurrentSession();
		List<T> entities = new ArrayList<T>();
		try {

			Query<T> query = session.createQuery("SELECT e FROM " + getEntityClass().getName() + " e", getEntityClass());
			entities = query.list();

			
		} catch (javax.validation.ConstraintViolationException cve) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
		} catch (org.hibernate.exception.ConstraintViolationException cve) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
		} catch (RuntimeException ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
			throw ex;
		} catch (Exception ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
			}
			throw new RuntimeException(ex);
		}
		return entities;
	}

	@SuppressWarnings("unchecked")
	private Class<T> getEntityClass() {
		return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
}