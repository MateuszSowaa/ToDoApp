package com.sowa.ToDoApp.utils;

import javax.persistence.EntityManager;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import com.sowa.ToDoApp.dao.TaskDAO;

/**
 * Application Lifecycle Listener implementation class IDB
 *
 */
public class IDB implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public IDB() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
        EntityManager em = DBConfig.createEntityManager();
        TaskDAO taskDAO = new TaskDAO(em);

        ServletRequest req = sre.getServletRequest();
        
        req.setAttribute("taskDAO", taskDAO);
    }
	
}
