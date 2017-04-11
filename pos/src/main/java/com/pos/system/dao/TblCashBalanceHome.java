package com.pos.system.dao;
// Generated Nov 30, 2016 5:15:19 PM by Hibernate Tools 5.2.0.Beta1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.pos.system.model.TblCashBalance;

/**
 * Home object for domain model class TblCashBalance.
 * 
 * @see com.pos.system.model.TblCashBalance
 * @author Hibernate Tools
 */
public class TblCashBalanceHome {

	private static final Log log = LogFactory.getLog(TblCashBalanceHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TblCashBalance transientInstance) {
		log.debug("persisting TblCashBalance instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TblCashBalance instance) {
		log.debug("attaching dirty TblCashBalance instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TblCashBalance instance) {
		log.debug("attaching clean TblCashBalance instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TblCashBalance persistentInstance) {
		log.debug("deleting TblCashBalance instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TblCashBalance merge(TblCashBalance detachedInstance) {
		log.debug("merging TblCashBalance instance");
		try {
			TblCashBalance result = (TblCashBalance) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblCashBalance findById(java.lang.Integer id) {
		log.debug("getting TblCashBalance instance with id: " + id);
		try {
			TblCashBalance instance = (TblCashBalance) sessionFactory.getCurrentSession()
					.get("com.pos.system.model.TblCashBalance", id);
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

	public List<TblCashBalance> findByExample(TblCashBalance instance) {
		log.debug("finding TblCashBalance instance by example");
		try {
			List<TblCashBalance> results = (List<TblCashBalance>) sessionFactory.getCurrentSession()
					.createCriteria("com.pos.system.model.TblCashBalance").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
