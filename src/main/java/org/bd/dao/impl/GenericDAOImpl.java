//package org.bd.dao.impl;
//
//import java.io.Serializable;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import org.bd.dao.GenericDAO;
//import javax.validation.*;
//
//public class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {
//
//
//	SessionFactory sessionFactory;
//
//	private final static Logger LOGGER = Logger.getLogger(GenericDAOImpl.class.getName());
//
//	public GenericDAOImpl() {
//		sessionFactory=HibernateUtil.getSessionFactory();
//	}
//
//	@Override
//	public void saveOrUpdate(T entity) {
//		Session session = sessionFactory.getCurrentSession();
//		try {
//			session.beginTransaction();
//			session.saveOrUpdate(entity);
//			session.getTransaction().commit();
//		} catch (javax.validation.ConstraintViolationException cve) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//		} catch (org.hibernate.exception.ConstraintViolationException cve) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new BussinessException(cve);
//		} catch (RuntimeException ex) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw ex;
//		} catch (Exception ex) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new RuntimeException(ex);
//		}
//	}
//
//	@Override
//	public T get(ID id) throws BussinessException {
//		Session session = sessionFactory.getCurrentSession();
//		try {
//			session.beginTransaction();
//			T entity = (T) session.get(getEntityClass(), id);
//			session.getTransaction().commit();
//
//			return entity;
//		} catch (javax.validation.ConstraintViolationException cve) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new BussinessException(cve);
//		} catch (org.hibernate.exception.ConstraintViolationException cve) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new BussinessException(cve);
//		} catch (RuntimeException ex) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw ex;
//		} catch (Exception ex) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new RuntimeException(ex);
//		}
//	}
//
//	@Override
//	public void delete(ID id) throws BussinessException {
//		Session session = sessionFactory.getCurrentSession();
//		try {
//			session.beginTransaction();
//			T entity = (T) session.get(getEntityClass(), id);
//			if (entity == null) {
//				throw new BussinessException(new BussinessMessage(null, "Los datos a borrar ya no existen"));
//			}
//			session.delete(entity);
//			session.getTransaction().commit();
//		} catch (javax.validation.ConstraintViolationException cve) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new BussinessException(cve);
//		} catch (org.hibernate.exception.ConstraintViolationException cve) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new BussinessException(cve);
//		} catch (BussinessException ex) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw ex;
//		} catch (RuntimeException ex) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw ex;
//		} catch (Exception ex) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new RuntimeException(ex);
//		}
//	}
//
//	@Override
//	public List<T> findAll() throws BussinessException {
//		Session session = sessionFactory.getCurrentSession();
//		try {
//
//			Query query = session.createQuery("SELECT e FROM " + getEntityClass().getName() + " e");
//			List<T> entities = query.list();
//
//			return entities;
//		} catch (javax.validation.ConstraintViolationException cve) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new BussinessException(cve);
//		} catch (org.hibernate.exception.ConstraintViolationException cve) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new BussinessException(cve);
//		} catch (RuntimeException ex) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw ex;
//		} catch (Exception ex) {
//			try {
//				if (session.getTransaction().isActive()) {
//					session.getTransaction().rollback();
//				}
//			} catch (Exception exc) {
//				LOGGER.log(Level.WARNING,"Falló al hacer un rollback", exc);
//			}
//			throw new RuntimeException(ex);
//		}
//	}
//
//	private Class<T> getEntityClass() {
//		return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//	}
//}