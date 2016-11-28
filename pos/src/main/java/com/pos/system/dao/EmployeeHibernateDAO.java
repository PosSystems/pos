package com.pos.system.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pos.system.model.Employee;

public class EmployeeHibernateDAO implements EmployeeDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(employee);
		tx.commit();
		session.close();
	}

	@Override
	public List<Employee> list() {
		Session session = this.sessionFactory.openSession();
		List<Employee> personList = session.createQuery("from Employee").getResultList();
		session.close();
		return personList;
	}

}
