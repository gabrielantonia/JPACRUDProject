package com.skilldistillery.pokemon.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.pokemon.entities.Pokemon;

@Service
@Transactional
public class PokemonDAOJpaImpl implements PokemonDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Pokemon findByID(int id) {
		return em.find(Pokemon.class, id);
	}

	@Override
	public List<Pokemon> findAll() {
		List<Pokemon> pokemon;
		String queryString = "select p from Pokemon p ";
		pokemon = em.createQuery(queryString, Pokemon.class).getResultList();
		return pokemon;
	}

}
