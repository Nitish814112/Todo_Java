package com.todo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.entities.Student;
import com.todo.entities.helper;

public class saveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public saveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		String title = request.getParameter("title");
	String content = request.getParameter("content");
	String name = request.getParameter("name");
	System.out.println(title);
	System.out.println(name);
	System.out.println(content);
	
	Student student=new Student(name, title, new Date(), content);
	System.out.println(student.getId());
	System.out.println(student.getDate());
	Session s=helper.getfactory().openSession();
	Transaction tx= s.beginTransaction();
	s.save(student);
	tx.commit();
	s.close();
	response.setContentType("text/html");
	PrintWriter out =response.getWriter();
//	out.println("<h1>Note is added Successfully!</h1>");
	response.sendRedirect("ShowTaker.jsp");
	
	}
	catch(Exception e)
	
	{
	e.printStackTrace()	;
	}	
	
	}

}
