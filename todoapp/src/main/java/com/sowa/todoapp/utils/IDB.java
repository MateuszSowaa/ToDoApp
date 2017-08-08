package com.sowa.todoapp.utils;

import javax.persistence.EntityManager;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import com.sowa.todoapp.dao.TaskDAO;

/**
 * Application Lifecycle Listener implementation class IDB
 *
 */
public class IDB implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent sre)  { 
         
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
        EntityManager em = DBConfig.createEntityManager();
        TaskDAO taskDAO = new TaskDAO(em);

        ServletRequest req = sre.getServletRequest();
        
        req.setAttribute("taskDAO", taskDAO);
    }	
}
