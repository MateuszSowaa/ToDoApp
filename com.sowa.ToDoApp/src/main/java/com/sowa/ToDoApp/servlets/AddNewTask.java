package com.sowa.ToDoApp.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sowa.ToDoApp.dao.TaskDAO;
import com.sowa.ToDoApp.entities.Task;


public class AddNewTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddNewTask() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/AddNTask.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaskDAO dao =(TaskDAO) request.getAttribute("taskDAO");
		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		if(name != null && desc != null){
			Task t = new Task();
			
			t.setName(name);
			t.setDescription(desc);
			dao.addTask(t);
			
		}
		doGet(request, response);
	}

}
