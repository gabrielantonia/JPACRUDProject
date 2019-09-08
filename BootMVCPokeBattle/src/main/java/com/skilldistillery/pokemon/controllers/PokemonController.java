package com.skilldistillery.pokemon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.pokemon.data.PokemonDAO;
import com.skilldistillery.pokemon.entities.Pokemon;

@Controller
public class PokemonController {

	@Autowired
	private PokemonDAO dao;

	@RequestMapping(path = "/")
	public String index(Model model) {
		List<Pokemon> pokemon= dao.findAll();
		model.addAttribute("pokemon", pokemon);
		return "index";
		// return "index"; // if using a ViewResolver.
	}
	
	@RequestMapping(path = "getPokemon.do")
	public String showPokemon(@RequestParam("pid") Integer pid, Model model) {
		Pokemon p = dao.findByID(pid);
		model.addAttribute("pokemon", p);
		return "sub/show";
		// return "show"; // if using a ViewResolver.
	}

	
}
