package com.pos.system.dao;
// Generated Nov 30, 2016 5:15:19 PM by Hibernate Tools 5.2.0.Beta1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

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
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TblReceiptHead transientInstance) {
		log.debug("persisting TblReceiptHead instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TblReceiptHead instance) {
		log.debug("attaching dirty TblReceiptHead instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TblReceiptHead instance) {
		log.debug("attaching clean TblReceiptHead instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TblReceiptHead persistentInstance) {
		log.debug("deleting TblReceiptHead instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TblReceiptHead merge(TblReceiptHead detachedInstance) {
		log.debug("merging TblReceiptHead instance");
		try {
			TblReceiptHead result = (TblReceiptHead) sessionFactory.getCurrentSession().merge(detachedInstance);
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
			TblReceiptHead instance = (TblReceiptHead) sessionFactory.getCurrentSession()
					.get("com.pos.system.model.TblReceiptHead", id);
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
			List<TblReceiptHead> results = (List<TblReceiptHead>) sessionFactory.getCurrentSession()
					.createCriteria("com.pos.system.model.TblReceiptHead").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
