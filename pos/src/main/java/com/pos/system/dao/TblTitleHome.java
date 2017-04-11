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

import com.pos.system.model.TblTitle;

/**
 * Home object for domain model class TblTitle.
 * 
 * @see com.pos.system.model.TblTitle
 * @author Hibernate Tools
 */
public class TblTitleHome {

	private static final Log log = LogFactory.getLog(TblTitleHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate/hibernate.cfg.xml")
				.buildSessionFactory();
		return sessionFactory;
	}

	public void persist(TblTitle transientInstance) {
		log.debug("persisting TblTitle instance");
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

	public void attachDirty(TblTitle instance) {
		log.debug("attaching dirty TblTitle instance");
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

	public void attachClean(TblTitle instance) {
		log.debug("attaching clean TblTitle instance");
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

	public void delete(TblTitle persistentInstance) {
		log.debug("deleting TblTitle instance");
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

	public TblTitle merge(TblTitle detachedInstance) {
		log.debug("merging TblTitle instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			TblTitle result = (TblTitle) session.merge(detachedInstance);
			session.flush();
			session.close();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblTitle findById(java.lang.Integer id) {
		log.debug("getting TblTitle instance with id: " + id);
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			TblTitle instance = (TblTitle) session.get("com.pos.system.model.TblTitle", id);
			session.flush();
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

	public List<TblTitle> findByExample(TblTitle instance) {
		log.debug("finding TblTitle instance by example");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			List<TblTitle> results = (List<TblTitle>) session.createCriteria("com.pos.system.model.TblTitle")
					.add(create(instance)).list();
			session.flush();
			session.close();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
