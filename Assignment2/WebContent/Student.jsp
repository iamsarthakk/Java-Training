<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.LinkedList"%>
 <%@ page import ="p1.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	LinkedList<Student> l = (LinkedList<Student>) request.getAttribute("slist");
	out.println("Id\tName\tMarks1\tMarks2\tMarks3\tTotal\tPercentage<br/>");
	for(int i=0;i<l.size();i++){
		int studentid = l.get(i).getStudentid();
		String sname = l.get(i).getSname();
		int marks1 = l.get(i).getMarks1();
		int marks2 = l.get(i).getMarks2();
		int marks3 = l.get(i).getMarks3();
		int total = marks1+marks2+marks3;
		double percentage = (total/3);
		out.println(studentid+"\t"+sname+"\t"+marks1+"\t"+marks2+"\t"+marks3+"\t"+total+"\t"+percentage);
	}
	%>
</body>
</html>