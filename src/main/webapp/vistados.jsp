<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bienvenido</h1>

<%
String dato=request.getParameter("dat");
%>
<label><%=dato%></label>
<!--<form action="Servletlogin" method="post">
<input type=Double name="art1">
<input type=Double name="art2">
<input type="submit" name="btnlog" value="Enviar">
</form>-->
<!--String dato=request.getParameter("dat1");
%>-->
<!--<label><="dat1"-->


</body>
</html>