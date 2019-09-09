<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%!{
		System.out.println("<p>test</p>");
	}%>
<!DOCTYPE html>
<html>
<head>

<jsp:include page="styletags.jsp"></jsp:include>
<meta charset="UTF-8">
<title>Pokemon Battles</title>
</head>
<body>
	<h1 style="text-align: center">
		Pokemon Battles <br />
		<br />
	</h1>
	<div>
	<form action="create.do">
				<button>Create New</button>
			</form> 
	</div>

	<h2>
		<form action="getPokemon.do" method="GET">
			Pokedex Number: <input type="text" name="pid" required /> <input
				type="submit" value="Search" />
		</form>
	</h2>
	<ul>
		<c:forEach items="${pokemon}" var="pokemon">
			<li><a href="getPokemon.do?pid=${pokemon.pokedexNumber}">${pokemon.pokedexNumber }
					: ${pokemon.name} </a></li>
		</c:forEach>
	</ul>
</body>
</html>