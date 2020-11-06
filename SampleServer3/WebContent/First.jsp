<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%request.setAttribute("sampleattribute", "Welcome to Genpact");
	String strViewPage="Target.jsp";
	RequestDispatcher dispatcher = request.getRequestDispatcher(strViewPage);
	if(dispatcher!=null){
		dispatcher.forward(request, response);
	}
	%>
</body>
</html>