<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="http://localhost:8080/springmvcTiles/js/jquery-1.7.2.min.js"></script>

<script type="text/javascript">
function getDistList()
{
	 var sCode=document.getElementById("stCode").value;
	 
	 $("#d").empty(); 
		$.ajax({
					url : "http://localhost:8080/springmvcTiles/dist.do?stCode="
							+ sCode,
					type : "GET",
					contentType : "application/json",
					dataType : 'json',

					success : function(modi) {
						alert("hi " + modi);
						/* $('#st').empty(); */

						for (var i = 0; i < modi.length; i++) {
							val = new Option(modi[i].distName,
									modi[i].distCode);
							$('#d').append(val);
							//$('#tbodyId').append(html1);
						}
					},

					error : function(jqXHR, exception) {
						console.log(exception);
					}
				});
	 
	 
	}

</script>

</head>
<body>
<f:form action="regSave.do" commandName="r">
<table border="3" bgcolor="yellow">
<tr><td>State Name</td><td>

<f:select path="stCode" id="stCode" onchange="getDistList()">
<f:options items="${modi}" itemValue="stCode" itemLabel="stName"/>
</f:select>


</td>




<td>District Name</td><td>


<f:select path="distCode" id="d">

</f:select>


</td></tr>
<tr><td>Name</td><td><f:input path="name"/></td>
<td>Phone</td><td><f:input path="phone"/></td></tr>
<tr><td><input type="submit"></td></tr>
</table>

</f:form>
</body>
</html>