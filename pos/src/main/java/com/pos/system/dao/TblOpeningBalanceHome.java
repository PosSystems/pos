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

import com.pos.system.model.TblOpeningBalance;

/**
 * Home object for domain model class TblOpeningBalance.
 * 
 * @see com.pos.system.model.TblOpeningBalance
 * @author Hibernate Tools
 */
public class TblOpeningBalanceHome {

	private static final Log log = LogFactory.getLog(TblOpeningBalanceHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate/hibernate.cfg.xml")
				.buildSessionFactory();
		return sessionFactory;
	}

	public void persist(TblOpeningBalance transientInstance) {
		log.debug("persisting TblOpeningBalance instance");
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

	public void attachDirty(TblOpeningBalance instance) {
		log.debug("attaching dirty TblOpeningBalance instance");
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

	public void attachClean(TblOpeningBalance instance) {
		log.debug("attaching clean TblOpeningBalance instance");
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

	public void delete(TblOpeningBalance persistentInstance) {
		log.debug("deleting TblOpeningBalance instance");
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

	public TblOpeningBalance merge(TblOpeningBalance detachedInstance) {
		log.debug("merging TblOpeningBalance instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			TblOpeningBalance result = (TblOpeningBalance) session.merge(detachedInstance);
			session.flush();
			session.close();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOpeningBalance findById(java.lang.Integer id) {
		log.debug("getting TblOpeningBalance instance with id: " + id);
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			TblOpeningBalance instance = (TblOpeningBalance) session.get("com.pos.system.model.TblOpeningBalance", id);
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

	public List<TblOpeningBalance> findByExample(TblOpeningBalance instance) {
		log.debug("finding TblOpeningBalance instance by example");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			List<TblOpeningBalance> results = (List<TblOpeningBalance>) session
					.createCriteria("com.pos.system.model.TblOpeningBalance").add(create(instance)).list();
			session.close();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
