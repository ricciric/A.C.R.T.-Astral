package it.uniroma3.siw.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.model.Trofeo;
import it.uniroma3.siw.spring.repository.TrofeoRepository;

@Service
public class TrofeoService {

	@Autowired
	private TrofeoRepository trofeoRepository;

	@Transactional
	public List<Trofeo> tutti(){
		return (List<Trofeo>) this.trofeoRepository.findAll();
	}
	
	

}
