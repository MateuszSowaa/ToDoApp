package com.sowa.ToDoApp.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class DBConfig implements ServletContextListener {
	private static EntityManagerFactory emf;
// sprawia �e nie ma bezpo�redniego dost�pu do fabryki menager�w
	public void contextDestroyed(ServletContextEvent arg0) {
		if ( emf != null && emf.isOpen())
			emf.close();
			

	}

	public void contextInitialized(ServletContextEvent arg0) {
		emf = Persistence.createEntityManagerFactory("com.sowa.ToDoApp");

	}
	public static EntityManager createEntityManager(){
		if(emf != null)
			return emf.createEntityManager();
		else
			return null;
	}

}
