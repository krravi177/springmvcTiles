<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="verifyLogin.do" commandName="log">
<table border="3" bgcolor="yellow">
<tr><td>UID</td><td><f:input path="uid"/></td></tr>
<tr><td>Pass</td><td><f:password path="pass"/></td></tr>
<tr><td><input type="submit"></td></tr>
</table>

</f:form>
</body>
</html>