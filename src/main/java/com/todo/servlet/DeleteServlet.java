package com.todo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.entities.Student;
import com.todo.entities.helper;


public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int todoId=Integer.parseInt(request.getParameter("todo_id").trim());
			Session s=helper.getfactory().openSession();
			Student student = s.get(Student.class,todoId);
			Transaction tx=s.beginTransaction();
			s.delete(student);
			tx.commit();
			s.close();
			response.sendRedirect("ShowTaker.jsp");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	

}
