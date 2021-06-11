package it.uniroma3.siw.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.repository.SocietaRepository;

@Service
public class SocietaService {

	@Autowired
	private SocietaRepository societaRepository;
	public SocietaService() {
		// TODO Auto-generated constructor stub
	}

}
