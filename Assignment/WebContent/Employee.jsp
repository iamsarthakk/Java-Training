<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import ="java.util.LinkedList"%>
 <%@ page import ="p1.Emp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	LinkedList<Emp> l = (LinkedList<Emp>) request.getAttribute("elist");
	out.println("Id\tName\tCity\tSalary<br/>");
	for(int i=0;i<l.size();i++){
		int eid = l.get(i).getEid();
		String ename = l.get(i).getEname();
		String ecity = l.get(i).getecity();
		double esal =l.get(i).getEsal();
		out.println(eid+"\t"+ename+"\t"+ecity+"\t"+esal);
	}
	%>
</body>
</html>