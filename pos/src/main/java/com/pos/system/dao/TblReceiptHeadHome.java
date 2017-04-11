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

import com.pos.system.model.TblReceiptHead;

/**
 * Home object for domain model class TblReceiptHead.
 * 
 * @see com.pos.system.model.TblReceiptHead
 * @author Hibernate Tools
 */
public class TblReceiptHeadHome {

	private static final Log log = LogFactory.getLog(TblReceiptHeadHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate/hibernate.cfg.xml")
				.buildSessionFactory();
		return sessionFactory;
	}

	public void persist(TblReceiptHead transientInstance) {
		log.debug("persisting TblReceiptHead instance");
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

	public void attachDirty(TblReceiptHead instance) {
		log.debug("attaching dirty TblReceiptHead instance");
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

	public void attachClean(TblReceiptHead instance) {
		log.debug("attaching clean TblReceiptHead instance");
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

	public void delete(TblReceiptHead persistentInstance) {
		log.debug("deleting TblReceiptHead instance");
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

	public TblReceiptHead merge(TblReceiptHead detachedInstance) {
		log.debug("merging TblReceiptHead instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			TblReceiptHead result = (TblReceiptHead) session.merge(detachedInstance);
			session.flush();
			session.close();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblReceiptHead findById(java.lang.Integer id) {
		log.debug("getting TblReceiptHead instance with id: " + id);
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			TblReceiptHead instance = (TblReceiptHead) session.get("com.pos.system.model.TblReceiptHead", id);
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

	public List<TblReceiptHead> findByExample(TblReceiptHead instance) {
		log.debug("finding TblReceiptHead instance by example");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			List<TblReceiptHead> results = (List<TblReceiptHead>) session
					.createCriteria("com.pos.system.model.TblReceiptHead").add(create(instance)).list();
			session.close();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
