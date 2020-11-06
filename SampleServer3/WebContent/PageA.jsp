<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page A</title>
</head>
<body>
<strong>This is page A</strong>
<br/>
<jsp:include page="PageB.jsp"/>
<br/>
<strong>Back to page A</strong>
</body>
</html>