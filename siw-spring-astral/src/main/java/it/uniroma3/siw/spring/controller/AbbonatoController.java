package it.uniroma3.siw.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.siw.spring.model.Abbonato;
import it.uniroma3.siw.spring.service.AbbonatoService;

@Controller
public class AbbonatoController {

	@Autowired 
	private AbbonatoService abbonatoService;
	
	@RequestMapping(value ="/newAbbonato", method = RequestMethod.GET)
	public String newAbbonato(Model model) {
		model.addAttribute("abbonato", new Abbonato());
		return "abbonatoForm.html";
	}
	
	@RequestMapping(value ="/abbonato", method = RequestMethod.POST)
	public String saveAbbonato(@ModelAttribute("abbonato") Abbonato abbonato, Model model) {
		this.abbonatoService.inserisci(abbonato);
		model.addAttribute("abbonato", abbonato);
		return "registrazioneSuccesso.html";
	}
	
	@RequestMapping(value="/abbonati", method=RequestMethod.GET)
	public String getAbbonati(Model model) {
		model.addAttribute("abbonati", this.abbonatoService.tutti());
		return "listaAbbonati.html";
	}

}
