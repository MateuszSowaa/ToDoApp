package com.sowa.todoapp.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class DBConfig
 *
 */
public class DBConfig implements ServletContextListener {
	private static EntityManagerFactory emf;

    public void contextDestroyed(ServletContextEvent sce) {
		if(emf != null && emf.isOpen())
			emf.close();
	}
	
    public void contextInitialized(ServletContextEvent arg0)  { 
    	emf = Persistence.createEntityManagerFactory("com.sowa.todoapp");
    }

	public static EntityManager createEntityManager() {
		if(emf != null)
			return emf.createEntityManager();
		else
			return null;
	}
}
