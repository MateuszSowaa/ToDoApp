package com.sowa.ToDoApp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sowa.ToDoApp.entities.Task;


public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public IndexServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain; charset=utf-8");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.sowa.ToDoApp");
		EntityManager em = emf.createEntityManager();
		Task task = em.find(Task.class, 1);
		
		PrintWriter pw = response.getWriter();
		pw.println(task.getName());

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
