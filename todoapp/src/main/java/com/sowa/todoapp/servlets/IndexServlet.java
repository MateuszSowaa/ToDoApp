package com.sowa.todoapp.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sowa.todoapp.dao.TaskDAO;
import com.sowa.todoapp.entities.Task;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	TaskDAO dao = (TaskDAO)request.getAttribute("taskDAO");
    	List<Task> t = dao.getTasks();
		request.setAttribute("tasks", t);
		request.getRequestDispatcher("/WEB-INF/ToDo.jsp").forward(request, response);
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
