package com.skilldistillery.pokemon.data;

import java.util.List;

import com.skilldistillery.pokemon.entities.Pokemon;


public interface PokemonDAO {
	Pokemon findByID(int id);
	List<Pokemon> findAll();
	Pokemon createPokemon(Pokemon pokemon);
	boolean deletePokemon(Pokemon pokemon);
	Pokemon updatePokemon(Pokemon pokemon, int pokedexNumber);
}
