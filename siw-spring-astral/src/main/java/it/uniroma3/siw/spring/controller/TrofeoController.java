package it.uniroma3.siw.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.siw.spring.controller.validator.TrofeoValidator;
import it.uniroma3.siw.spring.model.Trofeo;
import it.uniroma3.siw.spring.service.TrofeoService;

@Controller
public class TrofeoController {

	@Autowired
	private TrofeoService trofeoService;
	
	@Autowired
	private TrofeoValidator trofeoValidator;

	@RequestMapping(value = "listaTrofei", method=RequestMethod.GET)
	public String trofei(Model model) {
		model.addAttribute("trofei", this.trofeoService.tutti());
		return "trofei.html";
	}

	@RequestMapping(value = "modificaTrofeo/{id}", method=RequestMethod.GET)
	public String trofei(@PathVariable("id") Long id, Model model) {
		Trofeo trofeo = this.trofeoService.trofeoPerId(id);
		model.addAttribute("trofeo", trofeo);
		return "trofeoForm.html";
	}

	@RequestMapping(value = "modificaTrofeo/{id}", method=RequestMethod.POST)
	public String trofei(@ModelAttribute("trofeo") Trofeo trofeo, BindingResult bindingResult, Model model) {
		this.trofeoValidator.validate(trofeo, bindingResult);
		if(!bindingResult.hasErrors()) {
			this.trofeoService.inserisci(trofeo);
			model.addAttribute("trofei", this.trofeoService.tutti());
			return "trofei.html";
		}
		else {
			return "trofeoForm.html";
		}
	}
}
