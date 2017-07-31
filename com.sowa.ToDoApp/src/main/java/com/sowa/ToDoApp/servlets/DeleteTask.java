package com.sowa.ToDoApp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sowa.ToDoApp.dao.TaskDAO;

/**
 * Servlet implementation class DeleteTask
 */
public class DeleteTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTask() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/index").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TaskDAO dao = (TaskDAO)request.getAttribute("taskDAO");
		String strid = request.getParameter("id");
		int id = Integer.parseInt(strid);
		dao.deleteTask(id);
		doGet(request, response);
	}

}
