package it.uniroma3.siw.spring.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.model.Categoria;
import it.uniroma3.siw.spring.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Transactional
	public Categoria categoriaperId(Long id) {
		Optional<Categoria> optional = this.categoriaRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		else
			return null;
	}

}
