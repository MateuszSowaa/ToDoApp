package com.sowa.ToDoApp.servlets;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
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
		TaskDAO dao = new TaskDAO();
		Task t = new Task();
		
		t.setName("pranie");
		t.setDescription("kolorowe i białe");
		dao.addTask(t);
		request.setAttribute("task", t.getName());
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/ToDo.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
