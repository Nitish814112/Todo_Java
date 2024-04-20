<%@page import="com.todo.entities.Student"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.todo.entities.helper"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo:ShowTodo</title>
</head>
<%@include file="navbar.jsp"%>
<body>
	<%
Session s=helper.getfactory().openSession();
	Query q=s.createQuery("from Student");
	List<Student>list=q.list();
	for(Student s1:list)
	{
	%>
	<div class="container text-center">
		<div class="card mt-3" style="width: 40rem">
		<div class=container text-center >
		<img src="img/to-do-list.png" class="card-img-top mt-1" style="max-width: 100px"alt="...">
		
		</div>
			<div class="card-body">
				<h5 class="card-title" ><%=s1.getTitle()%></h5>
				<p class="card-text" ><%=s1.getDescr() %></p>
				<a href="DeleteServlet?todo_id=<%=s1.getId() %>" class="btn btn-danger">Delete</a>
				<a href="Update.jsp?todo_id=<%=s1.getId() %>" class="btn btn-primary">Update</a>
			</div>
		</div>
	</div>
	<% 
	}
     s.close();
	%>
	
	

</body>
</html>