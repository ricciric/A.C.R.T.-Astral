package it.uniroma3.siw.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.spring.model.Giocatore;

public interface GiocatoreRepository extends CrudRepository<Giocatore, Long>{

	public Optional<Giocatore> findById(Long id);
	
	public List<Giocatore> findByNome(String nome);
	
	public List<Giocatore> findByCognome(String cognome);
	
	public List<Giocatore> findByNomeAndCognome(String nome, String cognome);
}
