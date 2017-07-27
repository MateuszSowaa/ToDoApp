package com.sowa.ToDoApp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sowa.ToDoApp.dao.TaskDAO;
import com.sowa.ToDoApp.entities.Task;


public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public IndexServlet() {
        super();
      
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("txt/html");
		//PrintWriter pw = response.getWriter();
		TaskDAO dao = new TaskDAO();
		//Task t = new Task();
		List<Task> lista = dao.getTasks();
		dao.deleteTask(9);
		request.setAttribute("tasks", lista);
		request.getRequestDispatcher("/WEB-INF/ToDo.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}
	
}
