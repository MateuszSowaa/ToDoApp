package com.sowa.ToDoApp.utils;

import javax.persistence.EntityManager;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import com.sowa.ToDoApp.dao.TasksDAO;

/**
 * Application Lifecycle Listener implementation class InitialDB
 *
 */

public class InitialDB implements ServletRequestListener {

    
    public InitialDB() {
        
    }

	
    public void requestDestroyed(ServletRequestEvent arg0)  { 
       
    }

    public void requestInitialized(ServletRequestEvent arg0)  { 
         EntityManager em = DBConfig.createEntityManager();
         TasksDAO tasksDAO = new TasksDAO(em);
         ServletRequest req =arg0.getServletRequest();
         req.setAttribute("tasksDAO",tasksDAO);
    }
	
}
