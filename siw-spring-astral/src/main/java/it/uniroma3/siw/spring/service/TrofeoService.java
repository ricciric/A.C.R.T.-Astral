package it.uniroma3.siw.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.repository.TrofeoRepository;

@Service
public class TrofeoService {

	@Autowired
	private TrofeoRepository trofeoRepository;
	public TrofeoService() {
		// TODO Auto-generated constructor stub
	}

}
