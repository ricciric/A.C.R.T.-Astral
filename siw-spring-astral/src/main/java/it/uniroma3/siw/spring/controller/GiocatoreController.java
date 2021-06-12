package it.uniroma3.siw.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.siw.spring.service.GiocatoreService;

@Controller
public class GiocatoreController {

	@Autowired
	public GiocatoreService giocatoreService;
	
	@RequestMapping(value = "/giocatore/{id}", method = RequestMethod.GET)
	public String getGiocatore(@PathVariable("id") Long id, Model model) {
		model.addAttribute("giocatore", this.giocatoreService.giocatorePerId(id));
		return "giocatore.html";
	}
	
	@RequestMapping(value = "/listaGiocatori", method = RequestMethod.GET)
	public String getListaGiocatori(Model model) {
		model.addAttribute("giocatori", this.giocatoreService.tutti());
		return "listaGiocatori.html";
	}

}
