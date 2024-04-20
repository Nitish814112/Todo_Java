package com.todo.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.entities.Student;
import com.todo.entities.helper;


public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session s=helper.getfactory().openSession();
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		int todoid = Integer.parseInt(request.getParameter("todoId").trim()) ;
		String name=request.getParameter("name");
		Transaction tx=s.beginTransaction();
		Student student = s.get(Student.class,todoid);
		student.setId(todoid);
		student.setDescr(content);
		student.setName(name);
		student.setTitle(title);
		student.setDate(new Date());
		tx.commit();
		s.close();
		response.sendRedirect("ShowTaker.jsp");
		
	}

}
