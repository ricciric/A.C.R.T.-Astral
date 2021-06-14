package it.uniroma3.siw.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.siw.spring.service.MembroStaffService;

@Controller
public class MembroStaffController {
	
	@Autowired
	private MembroStaffService membroStaffService;

	@RequestMapping(value = "/listaStaff", method = RequestMethod.GET)
	public String getListaStaff(Model model) {
		 model.addAttribute("staff", this.membroStaffService.tutti());
		 return "listaStaff.html";
	}

}
