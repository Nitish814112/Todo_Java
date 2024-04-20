<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo:Add Note</title>

</head>
<body>
<%@include file="navbar.jsp" %> 
<div class="container">
<h3 style="font:italic"class="container text-center">Enter your Daily notes here</h3>
<br>
<form action="saveServlet" method="post">
  <div class="form-group">
    <label for="title">Title :</label>
    
    <input type="text" class="form-control" id="title" placeholder="Enter your title here" name="title" required >
    <label for="Name">Enter Name :</label>
    <input type="text" class="form-control" id="name" placeholder="Enter your Name" name="name" required >
    
  </div>
  <div class="form-group">
    <label for="Content">Content :</label>
    <textarea id="content" name="content" class="form-control " style="height:200px" placeholder="Enter your content here" required></textarea>
  </div>
  <div class="container text-center	">
  <button type="submit" class="btn btn-primary">Add</button>
  </div>
</form>
</div>

</body>
</html>