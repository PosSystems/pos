package com.pos.system.dao;

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DBAccess<ModelClass> {
	private static final Log log = LogFactory.getLog(DBAccess.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	private Class<ModelClass> type;

	public DBAccess(Class<ModelClass> type) {
		this.type = type;
	}

	public SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate/hibernate.cfg.xml")
				.buildSessionFactory();
		return sessionFactory;
	}

	public void persist(ModelClass transientInstance) {
		log.debug("persisting " + transientInstance.toString() + " instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			session.persist(transientInstance);
			transaction.commit();
			session.close();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ModelClass instance) {
		log.debug("attaching dirty " + instance.toString() + " instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(instance);
			transaction.commit();
			session.close();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ModelClass instance) {
		log.debug("attaching clean ModelClass instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			session.lock(instance, LockMode.NONE);
			transaction.commit();
			session.close();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ModelClass persistentInstance) {
		log.debug("deleting ModelClass instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			session.delete(persistentInstance);
			transaction.commit();
			session.close();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ModelClass merge(ModelClass detachedInstance) {
		log.debug("merging ModelClass instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			ModelClass result = (ModelClass) session.merge(detachedInstance);
			transaction.commit();
			session.close();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelClass findById(int id) {
		log.debug("getting ModelClass instance with id: " + id);
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			ModelClass instance = (ModelClass) session.get(type.getName(), id);
			transaction.commit();
			session.close();
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ModelClass> findByExample(ModelClass instance) {
		log.debug("finding ModelClass instance by example");
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			List<ModelClass> results = (List<ModelClass>) session.createCriteria(instance.getClass().getName())
					.add(create(instance)).list();
			transaction.commit();
			session.close();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	private DBAccess() {
	}

}
