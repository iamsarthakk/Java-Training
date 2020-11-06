<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Factorial Number Using Recursion</h1>
	<%!
	int numberfactorial(int n){
		if(n==1){
			return n;
		}
		else{
			return n*numberfactorial(n-1);
		}
	}
	%>
	
	<%
	out.println("The factorial of 5 is "+numberfactorial(5));
	%>
</body>
</html>