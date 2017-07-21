package com.sowa.ToDoApp.servlets;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sowa.ToDoApp.dao.TasksDAO;
import com.sowa.ToDoApp.entities.Task;

/**
 * Servlet implementation class AddTaskServlet
 */
public class AddTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTaskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/view/newTask.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		if(!"".equals(name) && !"".equals(description)){
			Timestamp dat = new Timestamp(new Date().getTime());
			TasksDAO tasksDAO = (TasksDAO) request.getAttribute("tasksDAO");
			Task t = new Task();
			t.setDate(dat);
			t.setName(name);
			t.setDescription(description);
			if(tasksDAO.addTask(t))
				response.sendRedirect(request.getContextPath() + "/t?id=" + t.getId());
			
		}
		doGet(request, response);
	}

}
