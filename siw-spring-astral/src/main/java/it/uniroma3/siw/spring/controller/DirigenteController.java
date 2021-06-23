package it.uniroma3.siw.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.siw.spring.service.DirigenteService;

@Controller
public class DirigenteController {

	@Autowired
	private DirigenteService dirigenteService;
	
	@RequestMapping(value = "/listaDirigenti", method = RequestMethod.GET)
	public String getListaDirigenti(Model model) {
		model.addAttribute("dirigenti", this.dirigenteService.tutti());
		return "/";
	}

}
