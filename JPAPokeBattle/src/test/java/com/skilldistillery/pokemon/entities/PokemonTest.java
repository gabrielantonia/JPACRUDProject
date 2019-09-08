package com.skilldistillery.pokemon.entities;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokemonTest {

	static private EntityManagerFactory emf;
	static private EntityManager em;
	static Pokemon pokemon;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("PokeBattle");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		pokemon = new Pokemon();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		pokemon = null;
	}

	@Test
	void Test_Name() {
		pokemon = em.find(Pokemon.class, 1);
		assertTrue(pokemon.getName().contentEquals("Bulbasaur"));
	}

}
