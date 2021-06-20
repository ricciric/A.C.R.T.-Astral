package it.uniroma3.siw.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
	public String index(Model model) {
			return "index";
	}
	
	@RequestMapping(value="/informazioni", method = RequestMethod.GET) 
	public String informazioni(Model model){
		return "informazioni.html";
	}
	
	@RequestMapping(value="/contatti", method = RequestMethod.GET) 
	public String contatti(Model model){
		return "contatti.html";
	}
}