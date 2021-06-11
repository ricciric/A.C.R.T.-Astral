package it.uniroma3.siw.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.repository.GiocatoreRepository;

@Service
public class GiocatoreService {

	@Autowired
	private GiocatoreRepository giocatoreRepository;
	public GiocatoreService() {
		// TODO Auto-generated constructor stub
	}

}
