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
		<table>
			<thead>
				<tr>
					<th>Aika</th>
					<th>Paino</th>
				</tr>
				<c:forEach var="data" items="${painot}">

					<tr>
						<td>${data.aikaleima}</td>
						<td>${data.paino}</td>
					</tr>
				</c:forEach>


				<tr>
					<form:form modelAttribute="paino" method="post">
						
						<td><button type="submit" class="button">Lisää paino</button></td>
						<td><form:input path="paino" type="number" step="0.1" min="0" maxlength="5" size="5" max="999.9"/>
						
					</form:form>
				</tr>
		</table>
	</div>



</body>
</html>