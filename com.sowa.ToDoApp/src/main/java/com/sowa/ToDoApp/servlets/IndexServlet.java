package com.sowa.ToDoApp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		String stringId = request.getParameter("id");
		if(stringId != null){
			int id = Integer.parseInt(stringId);
			TasksDAO dao =  new TasksDAO();
			Task t = dao.getTask(id);
			request.setAttribute("task", t);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/index.jsp");
			rd.forward(request, response);
		//for(Task t : lista)
		//	response.getWriter().println(t.getId() + t.getName() + t.getDescription() + t.getDate());
		}else 
			response.sendRedirect(request.getContextPath() + "/");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
