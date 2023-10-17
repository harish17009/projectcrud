<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<td>id</td>
<td>name</td>
<td>mobile</td>
<td>gender</td>
</tr>
<c:forEach items="${list}" var="x" >

 <tr>
 <td>${x.id}</td>
 <td>${x.name}</td>
 <td>${x.mobile}</td>
 <td>${x.gender}</td>
 
 <td><a href="delete?id=${x.id}"> <button>delete</button> </a> </td>
 <td><a href="edit.jsp?id=${x.id}"> <button>edit</button> </a> </td>

</tr>

 

</c:forEach>



</table>
<a href="home.html"><button>home</button> </a>
</body>
</html>