<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Using Multidimensional Arrays</h1>
	<%!double cars[][] = new double[2][10]; %>
	<% cars[0][2]=1111.09;
	cars[1][4]=19000.07;
	
	out.println("Price of mazda cars with category 2 is; &nbsp;"
				+cars[0][2]+"$<br/>");
				
	out.println("Price of BMW cars with category 4 is"+
				cars[1][4]+"$<br/>"); %>
	
</body>
</html>