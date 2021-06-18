package it.uniroma3.siw.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.siw.spring.model.Categoria;
import it.uniroma3.siw.spring.service.CategoriaService;

@Controller
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(value = "/categoria/{id}", method = RequestMethod.GET)
	public String getCategoria(@ModelAttribute("id") Long id, Model model) {
		Categoria categoria = this.categoriaService.categoriaperId(id);
		model.addAttribute("categoria", categoria);
		model.addAttribute("giocatori", categoria.getGiocatori());
		return "categoria.html";
	}

}
