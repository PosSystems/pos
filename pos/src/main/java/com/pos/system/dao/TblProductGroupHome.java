package com.pos.system.dao;
// Generated Nov 30, 2016 5:15:19 PM by Hibernate Tools 5.2.0.Beta1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.pos.system.model.TblProductGroup;

/**
 * Home object for domain model class TblProductGroup.
 * @see com.pos.system.dao.TblProductGroup
 * @author Hibernate Tools
 */
public class TblProductGroupHome {

	private static final Log log = LogFactory.getLog(TblProductGroupHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TblProductGroup transientInstance) {
		log.debug("persisting TblProductGroup instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TblProductGroup instance) {
		log.debug("attaching dirty TblProductGroup instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TblProductGroup instance) {
		log.debug("attaching clean TblProductGroup instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TblProductGroup persistentInstance) {
		log.debug("deleting TblProductGroup instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TblProductGroup merge(TblProductGroup detachedInstance) {
		log.debug("merging TblProductGroup instance");
		try {
			TblProductGroup result = (TblProductGroup) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblProductGroup findById(int id) {
		log.debug("getting TblProductGroup instance with id: " + id);
		try {
			TblProductGroup instance = (TblProductGroup) sessionFactory.getCurrentSession()
					.get("com.pos.system.dao.TblProductGroup", id);
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

	public List<TblProductGroup> findByExample(TblProductGroup instance) {
		log.debug("finding TblProductGroup instance by example");
		try {
			List<TblProductGroup> results = (List<TblProductGroup>) sessionFactory.getCurrentSession()
					.createCriteria("com.pos.system.dao.TblProductGroup").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
