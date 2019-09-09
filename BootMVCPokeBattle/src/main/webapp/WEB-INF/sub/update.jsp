<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<jsp:include page="../styletags.jsp"></jsp:include>
<meta charset="UTF-8">
<meta charset="UTF-8">
<title>${pokemon.name}</</title>
</head>
<body style="text-align= center">
	<div>
		<h2>
		<a href='https://pokemon.fandom.com/wiki/${pokemon.name}'>${pokemon.name}</a>
		</h2>
		<br>
		<h3>
		HP: ${pokemon.hp} <br>
		Attack: ${pokemon.attack } <br>
		Defense: ${pokemon.defense } <br>
		Sp. Attack: ${pokemon.specialAttack } <br>
		Sp. Defense:  ${pokemon.specialDefense } <br>
		</h3>
		<p>
			<c:choose>
				<c:when 
					test="${pokemon.pokedexNumber < 10 && pokemon.pokedexNumber > 0 }">
					<img alt="image of ${pokemon.name }" src="https://assets.pokemon.com/assets/cms2/img/pokedex/full/00${pokemon.pokedexNumber}.png">
				</c:when>
					
				<c:when
					test="${pokemon.pokedexNumber < 100  && pokemon.pokedexNumber >= 10}">
					<img alt="image of ${pokemon.name }" src="https://assets.pokemon.com/assets/cms2/img/pokedex/full/0${pokemon.pokedexNumber}.png">
				</c:when>

				<c:otherwise>
					<img alt="image of ${pokemon.name }" src="https://assets.pokemon.com/assets/cms2/img/pokedex/full/${pokemon.pokedexNumber}.png">
				</c:otherwise>
			</c:choose>
		</p>
		<p>
			
		</p>
	</div>
</body>
</html>