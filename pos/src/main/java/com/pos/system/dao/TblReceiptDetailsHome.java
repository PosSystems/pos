package com.pos.system.dao;
// Generated Nov 30, 2016 5:15:19 PM by Hibernate Tools 5.2.0.Beta1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

/**
 * Home object for domain model class TblReceiptDetails.
 * @see com.pos.system.dao.TblReceiptDetails
 * @author Hibernate Tools
 */
public class TblReceiptDetailsHome {

	private static final Log log = LogFactory.getLog(TblReceiptDetailsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TblReceiptDetails transientInstance) {
		log.debug("persisting TblReceiptDetails instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TblReceiptDetails instance) {
		log.debug("attaching dirty TblReceiptDetails instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TblReceiptDetails instance) {
		log.debug("attaching clean TblReceiptDetails instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TblReceiptDetails persistentInstance) {
		log.debug("deleting TblReceiptDetails instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TblReceiptDetails merge(TblReceiptDetails detachedInstance) {
		log.debug("merging TblReceiptDetails instance");
		try {
			TblReceiptDetails result = (TblReceiptDetails) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblReceiptDetails findById(java.lang.Integer id) {
		log.debug("getting TblReceiptDetails instance with id: " + id);
		try {
			TblReceiptDetails instance = (TblReceiptDetails) sessionFactory.getCurrentSession()
					.get("com.pos.system.dao.TblReceiptDetails", id);
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

	public List<TblReceiptDetails> findByExample(TblReceiptDetails instance) {
		log.debug("finding TblReceiptDetails instance by example");
		try {
			List<TblReceiptDetails> results = (List<TblReceiptDetails>) sessionFactory.getCurrentSession()
					.createCriteria("com.pos.system.dao.TblReceiptDetails").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
