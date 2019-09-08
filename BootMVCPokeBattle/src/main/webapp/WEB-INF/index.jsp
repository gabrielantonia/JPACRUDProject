<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="styletags.jsp"></jsp:include>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<form action="getPokemon.do" method="GET">
			Film ID: <input type="text" name="pid" /> <input type="submit"
				value="Show Pokemon" />
		</form>
	</h2>
	<ul>
		<c:forEach items="${pokemon}" var="pokemon">
			<li><a href="getPokemon.do?pid=${pokemon.id}">${pokemon.title} </a></li>
		</c:forEach>
	</ul>
</body>
</html>