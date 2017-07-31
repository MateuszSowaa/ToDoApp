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
    	
    	TaskDAO dao = (TaskDAO)request.getAttribute("taskDAO");
		//Task t = dao.getTask(4);
    	List<Task> t = dao.getTasks();
		request.setAttribute("tasks", t);
		request.getRequestDispatcher("/WEB-INF/ToDo.jsp").forward(request, response);
		
	}
		
    
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request,response);
	}
	
}
