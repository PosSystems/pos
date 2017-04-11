package com.pos.system.dao;
// Generated Nov 30, 2016 5:15:19 PM by Hibernate Tools 5.2.0.Beta1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

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
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TblOpeningBalance transientInstance) {
		log.debug("persisting TblOpeningBalance instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TblOpeningBalance instance) {
		log.debug("attaching dirty TblOpeningBalance instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TblOpeningBalance instance) {
		log.debug("attaching clean TblOpeningBalance instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TblOpeningBalance persistentInstance) {
		log.debug("deleting TblOpeningBalance instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TblOpeningBalance merge(TblOpeningBalance detachedInstance) {
		log.debug("merging TblOpeningBalance instance");
		try {
			TblOpeningBalance result = (TblOpeningBalance) sessionFactory.getCurrentSession().merge(detachedInstance);
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
			TblOpeningBalance instance = (TblOpeningBalance) sessionFactory.getCurrentSession()
					.get("com.pos.system.model.TblOpeningBalance", id);
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
			List<TblOpeningBalance> results = (List<TblOpeningBalance>) sessionFactory.getCurrentSession()
					.createCriteria("com.pos.system.model.TblOpeningBalance").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
