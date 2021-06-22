package it.uniroma3.siw.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.repository.DirigenteRepository;

@Service
public class DirigenteService {

	@Autowired
	private DirigenteRepository dirigenteRepository;


}
