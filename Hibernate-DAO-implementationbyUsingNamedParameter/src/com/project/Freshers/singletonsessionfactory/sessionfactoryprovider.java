package com.project.Freshers.singletonsessionfactory;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sessionfactoryprovider {
	private static SessionFactory sessionFactory = null;

	static {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		System.out.println("Invoked get session factory");
		if(sessionFactory!=null) {
			System.out.println("session factory is closed");
			return sessionFactory;
		}
		else {
			System.out.println("session factory is not closed");
			return sessionFactory;
			}
		}
		public static void CloseSessionFactory() {
			System.out.println("Invoked close session factory");
			try {
			if(sessionFactory!=null) {
				sessionFactory.close();
				System.out.println("sessionfactory is closed");
			}
			else {
				System.out.println("sessionfactory is not closed");
			}
			
		}
			catch (Exception e) {
			System.out.println(e.getMessage());
			}

	}
}
