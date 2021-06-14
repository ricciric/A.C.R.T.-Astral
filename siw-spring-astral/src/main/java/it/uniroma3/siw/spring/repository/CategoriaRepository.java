package it.uniroma3.siw.spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.spring.model.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

	public Optional<Categoria> findById(Long id);
}
