package com.project.Freshers.Dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.Freshers.Entity.Freshers;
import com.project.Freshers.singletonsessionfactory.sessionfactoryprovider;

import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

public class FreshersDaoImpl implements FreshersDao {

	private SessionFactory sessionFactory;

	@Override
	public void saveFreshersEntity(Freshers freshers) {
		System.out.println("Invoked get Freshers Entity by id()");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			sessionFactory = sessionfactoryprovider.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(freshers);
			System.out.println("data saved successfully..,");
			transaction.commit();

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();

			} else {
				System.out.println("session is not closed");
			}
		}

	}

	@Override
	public void getFreshersEntityById(int Id) {
		System.out.println("Invoked get Freshers Entity by id()");
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory = sessionfactoryprovider.getSessionFactory();
			session = sessionFactory.openSession();
			String hqlQuery = "from Freshers where Id=id";
			Query query = session.createQuery(hqlQuery);
			query.setParameter("Id", Id);
			Object object = query.uniqueResult();
			System.out.println("get Freshers Entity by id:"+object);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			} else {
				System.out.println("session is not closed");
			}
			sessionfactoryprovider.CloseSessionFactory();
		}

	}

}
