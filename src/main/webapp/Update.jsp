<%@page import="com.todo.entities.Student"%>
<%@page import="com.todo.entities.helper"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo:Update</title>
<link rel="shortcut icon" href="img/to-do-list.png" type="image/x-icon">

</head>
<body>
<%@include file="navbar.jsp" %> 
<div class="container">
<h3 style="font:italic"class="container text-center mt-3">Update notes</h3>
<br>
<%
int todoId=Integer.parseInt(request.getParameter("todo_id").trim());
Session s=helper.getfactory().openSession();
Student student = s.get(Student.class,todoId);



%>
<form action="UpdateServlet" method="post">
  <div class="form-group">
  <input value="<%=student.getId()%>"name="todoId" type="hidden"/>
    <label for="title">Title :</label>
    <input type="text" class="form-control" id="title" placeholder="Enter your title here" name="title"  value=" <%=student.getTitle()%> ">
    <label for="Name">Enter Name :</label>
    <input type="text" class="form-control" id="name" placeholder="Enter your Name" name="name" value="<%=student.getName()%>">
    
  </div>
  <div class="form-group">
    <label for="Content">Content :</label>
    <textarea id="content" name="content" class="form-control" style="height:200px" placeholder="Enter your content here"  ><%=student.getDescr()%></textarea>
  </div>
  <div class="container text-center	">
  <button type="submit" class="btn btn-success">Save</button>
  </div>
</form>
</div>

</body>
</html>