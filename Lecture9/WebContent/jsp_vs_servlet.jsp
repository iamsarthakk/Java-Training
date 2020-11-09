<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome, Please enter the Employee values: </h2>
	<form name="sampleForm" method=GET action="jsp_vs_servlet.jsp">
	Employee id
	<input name="eid" type="number"><br/>
	Employee name
	<input name="ename" type="text"><br/>

	<input type="submit" value="Submit">
	</form>
	
	<%
	out.println(request.getParameter("eid")+"\t"+ request.getParameter("ename"));
	%>
</body>
</html>