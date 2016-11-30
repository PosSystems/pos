package com.pos.system.dao;
// Generated Nov 30, 2016 5:15:19 PM by Hibernate Tools 5.2.0.Beta1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.pos.system.model.TblEmployee;

/**
 * Home object for domain model class TblEmployee.
 * @see com.pos.system.dao.TblEmployee
 * @author Hibernate Tools
 */
public class TblEmployeeHome {

	private static final Log log = LogFactory.getLog(TblEmployeeHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TblEmployee transientInstance) {
		log.debug("persisting TblEmployee instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TblEmployee instance) {
		log.debug("attaching dirty TblEmployee instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TblEmployee instance) {
		log.debug("attaching clean TblEmployee instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TblEmployee persistentInstance) {
		log.debug("deleting TblEmployee instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TblEmployee merge(TblEmployee detachedInstance) {
		log.debug("merging TblEmployee instance");
		try {
			TblEmployee result = (TblEmployee) sessionFactory.getCurrentSession().merge(detachedInstance);
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
			TblEmployee instance = (TblEmployee) sessionFactory.getCurrentSession()
					.get("com.pos.system.dao.TblEmployee", id);
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
			List<TblEmployee> results = (List<TblEmployee>) sessionFactory.getCurrentSession()
					.createCriteria("com.pos.system.dao.TblEmployee").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
