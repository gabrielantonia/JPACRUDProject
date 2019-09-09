package com.skilldistillery.pokemon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		return "/WEB-INF/index.jsp";
		// return "index"; // if using a ViewResolver.
	}
	@RequestMapping(path = "create.do")
	public ModelAndView create() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/sub/create.jsp");
		return mv;
		// return "index"; // if using a ViewResolver.
	}
	
	@RequestMapping(path = "getPokemon.do")
	public String showPokemon(@RequestParam("pid") Integer pid, Model model) {
		Pokemon p = dao.findByID(pid);
		model.addAttribute("pokemon", p);
		return "/WEB-INF/sub/show.jsp";
		// return "show"; // if using a ViewResolver.
	}
	
	@RequestMapping(path = "createPokemon.do", method = RequestMethod.POST)
	public String createPokemon( @ModelAttribute("pokemon")Pokemon pokemon, Model model) {
		model.addAttribute("pokemon", pokemon);
		dao.createPokemon(pokemon);
		return "/WEB-INF/index.jsp";
	}
	
	@RequestMapping(path = "deletePokemon.do", method = RequestMethod.POST)
	public ModelAndView deletePokemon(@ModelAttribute("pokemon") Pokemon pokemon) {
		ModelAndView mv = new ModelAndView();
		boolean deletePokemon = dao.deletePokemon(pokemon);
		if (deletePokemon) {
			mv.setViewName("WEB-INF/sub/delete.jsp");
		} else {
			mv.setViewName("WEB-INF/sub/errorDeletion.jsp");
		}
		return mv;
	}

	
}
