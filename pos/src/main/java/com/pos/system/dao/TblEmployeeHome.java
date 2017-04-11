package com.pos.system.dao;
// Generated Nov 30, 2016 5:15:19 PM by Hibernate Tools 5.2.0.Beta1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pos.system.model.TblEmployee;

/**
 * Home object for domain model class TblEmployee.
 * 
 * @see com.pos.system.model.TblEmployee
 * @author Hibernate Tools
 */
public class TblEmployeeHome {

	private static final Log log = LogFactory.getLog(TblEmployeeHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate/hibernate.cfg.xml")
				.buildSessionFactory();
		return sessionFactory;
	}

	public void persist(TblEmployee transientInstance) {
		log.debug("persisting TblEmployee instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.persist(transientInstance);
			session.flush();
			session.close();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TblEmployee instance) {
		log.debug("attaching dirty TblEmployee instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.saveOrUpdate(instance);
			session.flush();
			session.close();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TblEmployee instance) {
		log.debug("attaching clean TblEmployee instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.lock(instance, LockMode.NONE);
			session.flush();
			session.close();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TblEmployee persistentInstance) {
		log.debug("deleting TblEmployee instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.delete(persistentInstance);
			session.flush();
			session.close();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TblEmployee merge(TblEmployee detachedInstance) {
		log.debug("merging TblEmployee instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			TblEmployee result = (TblEmployee) session.merge(detachedInstance);
			session.flush();
			session.close();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblEmployee findById(int id) {
		log.debug("getting TblEmployee instance with id: " + id);
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			TblEmployee instance = (TblEmployee) session.get("com.pos.system.model.TblEmployee", id);
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

	public List<TblEmployee> findByExample(TblEmployee instance) {
		log.debug("finding TblEmployee instance by example");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			List<TblEmployee> results = (List<TblEmployee>) session.createCriteria("com.pos.system.model.TblEmployee")
					.add(create(instance)).list();
			session.close();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
