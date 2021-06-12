package it.uniroma3.siw.spring.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.model.Giocatore;
import it.uniroma3.siw.spring.repository.GiocatoreRepository;

@Service
public class GiocatoreService {

	@Autowired
	private GiocatoreRepository giocatoreRepository;
	
	@Transactional
	public List<Giocatore> tutti(){
		return (List<Giocatore>) this.giocatoreRepository.findAll();
	}
	
	@Transactional
	public Giocatore giocatorePerId(Long id) {
		Optional<Giocatore> optional = this.giocatoreRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		else 
			return null;
	}

}
