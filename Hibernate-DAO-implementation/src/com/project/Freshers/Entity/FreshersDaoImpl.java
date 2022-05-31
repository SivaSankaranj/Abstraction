package com.project.Freshers.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.Freshers.Dao.FreshersDao;

public class FreshersDaoImpl implements FreshersDao {

	@Override
	public void saveFreshersEntity() {
		System.out.println("Invoked save freshers entity method");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			// configure the hibernate file
			Configuration config = new Configuration();
			config.addAnnotatedClass(Freshers.class);
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			// data insertion to database begin here
			Freshers freshers = new Freshers( "Nayan", 8845621356L, 95000, true);
			session.save(freshers);
			session.getTransaction().commit();
			System.out.println("Data inserted successfully......,");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {
			if (session != null) {
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
			if (sessionFactory != null) {
				System.out.println("Session is closed");
			} else {
				System.out.println("session is not closed");
			}
			if (transaction != null) {
				System.out.println("Session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}
	}

	@Override
	public void ReadFreshersEntity() {
		System.out.println("Invoked read data by id");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(Freshers.class);
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			Freshers freshers = session.get(Freshers.class, 8);
			System.out.println("data read is done:" + freshers);
			transaction.commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (sessionFactory != null) {
				System.out.println("connection is closed");
			} else {
				System.out.println("connection is not closed");
			}
			if (session != null) {
				System.out.println("connection is close");
			} else {
				System.out.println("connection is not closed");
			}
			if (transaction != null) {
				System.out.println("connection is closed");
			} else {
				System.out.println("connection is not closed");
			}
		}

	}

	@Override
	public void UpdateFreshersEntity() {
		System.out.println("Invoked Update entity method");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(Freshers.class);
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			//Data update to DB
			Freshers freshers = session.get(Freshers.class, 7);
			System.out.println("Freshers Entity:" + freshers);
			freshers.setName("Monisha");
			freshers.setMobileNumber(7984569871L);
			freshers.setSalary(71000);
			session.update(freshers);
			transaction.commit();
			System.out.println("Data is updated successfully");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (sessionFactory != null) {
				System.out.println("connection is closed");
			} else {
				System.out.println("connection is not closed");
			}
			if (session != null) {
				System.out.println("connection is close");
			} else {
				System.out.println("connection is not closed");
			}
			if (transaction != null) {
				System.out.println("connection is closed");
			} else {
				System.out.println("connection is not closed");
			}

		}
	}

	@Override
	public void DeleteFreshersEntity() {
		System.out.println("Invoked Delete entity method");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(Freshers.class);
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Freshers freshers = session.get(Freshers.class, 7);
			System.out.println("Freshers Entity:" + freshers);
			session.delete(freshers);
			transaction.commit();
			System.out.println("Data is Deleted successfully");

		} catch (Exception e) {
			System.out.println("inside catch block exception");
			System.out.println(e.getMessage());
		} finally {
			if (sessionFactory != null) {
				System.out.println("connection is closed");
			} else {
				System.out.println("connection is not closed");
			}
			if (session != null) {
				System.out.println("connection is close");
			} else {
				System.out.println("connection is not closed");
			}
			if (transaction != null) {
				System.out.println("connection is closed");
			} else {
				System.out.println("connection is not closed");
			}

		}
	}
}