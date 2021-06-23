package it.uniroma3.siw.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.model.Dirigente;
import it.uniroma3.siw.spring.repository.DirigenteRepository;

@Service
public class DirigenteService {

	@Autowired
	private DirigenteRepository dirigenteRepository;

	@Transactional
	public List<Dirigente> tutti(){
		return (List<Dirigente>) this.dirigenteRepository.findAll();
	}

}
