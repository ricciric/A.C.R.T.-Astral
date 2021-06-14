package it.uniroma3.siw.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.model.Abbonato;
import it.uniroma3.siw.spring.repository.AbbonatoRepository;

@Service
public class AbbonatoService {

	@Autowired
	private AbbonatoRepository abbonatoRepository;

	@Transactional
	public void inserisci(Abbonato abbonato) {
		this.abbonatoRepository.save(abbonato);
	}
	
	@Transactional
	public List<Abbonato> tutti(){
		return (List<Abbonato>) this.abbonatoRepository.findAll();
	}
}
