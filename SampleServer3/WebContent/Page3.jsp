<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Parsing Arrays to Methods</h1>
<%!
int sumArray(int[] passedArray){
	int sum=0;
	for(int i=0;i<passedArray.length;i++){
		sum+=passedArray[i];
	}
	return sum;
}
%>

<%
int numbersArray[]={-1, 2, -3, 4, 5};
out.println("The Elements of array are: ");
for(int i=0;i<numbersArray.length;i++){
	out.println("numbersArray["+i+"]="+" "+numbersArray[i]+"<br/>");
}
	
out.println("The result of summation of all the array elements.....<br/>");
out.println(sumArray(numbersArray));
%>
</body>
</html>