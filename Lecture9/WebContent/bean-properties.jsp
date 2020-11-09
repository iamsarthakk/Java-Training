<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accessing Bean Properties</title>
</head>
<body>
	<ul>
		<li><b>First Name:</b>${employee.name.firstName }</li>
		<li><b>Last Name:</b>${employee.name.lastName }</li>
		<li><b>Company Name:</b>${employee.company.companyName }</li>
		<li><b>Company Business:</b>${employee.company.business }</li>
		
	</ul>
</body>
</html>