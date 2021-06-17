package it.uniroma3.siw.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.siw.spring.service.TrofeoService;

@Controller
public class TrofeoController {

	@Autowired
	private TrofeoService trofeoService;
	
	@RequestMapping(value = "listaTrofei", method=RequestMethod.GET)
	public String trofei(Model model) {
		model.addAttribute("trofei", this.trofeoService.tutti());
		return "trofei.html";
	}
}
