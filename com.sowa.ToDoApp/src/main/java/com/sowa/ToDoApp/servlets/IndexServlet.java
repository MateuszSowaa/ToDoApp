package com.sowa.ToDoApp.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sowa.ToDoApp.dao.TasksDAO;
import com.sowa.ToDoApp.entities.Task;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public IndexServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TasksDAO dao = (TasksDAO)request.getAttribute("tasksDAO");
		List<Task> tasks = dao.getTasks();
		request.setAttribute("tasks", tasks);
		request.getRequestDispatcher("WEB-INF/view/index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
