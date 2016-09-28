<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Harjoitus 5: Painonhallinta</title>
</head>
<link rel="stylesheet" type="text/css" href="resources/main.css">
<body>

	<div class="tableDiv">
		<h1><font color="red"><c:out value="${message}" /></font></h1>
		<form:form modelAttribute="user" method="post">
		  	<fieldset>		
				<legend>Kirjaudu sisään</legend>
				<p>
					<form:label	path="login">Käyttäjätunnus</form:label><br/>
					<form:input path="login" />		
				</p>
				<p>	
					<form:label path="password">Salasana</form:label><br/>
					<form:input path="password" type="password"/>
				</p>
				<p>	
					<button type="submit">Kirjaudu</button>
				</p>
			</fieldset>
		</form:form>






	</div>
<pre>
Testitunnarit:
Login: test
p/w: test
</pre>
</body>
</html>