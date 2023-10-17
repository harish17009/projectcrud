<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int id=Integer.parseInt(request.getParameter("id")); %>

<form action="edit" method="post">

id<input type="number" id="id" name="id" value="<%=id%>">
name<input type="text" id="name" name="name" >
gender<input type="radio" id="gender" name="gender" value="male" >male
     <input type="radio" id="gender" name="gender" value="female">female

mobile<input type="number" id="mobile" name="mobile" >
<button>edit</button>

</form>

</body>
</html>