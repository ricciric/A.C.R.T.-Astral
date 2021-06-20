package it.uniroma3.siw.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trofeo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;
	
	private Integer numeroVittorie;

	public Trofeo() {
	}

	public Trofeo(String nome, Integer numeroVittorie) {
		this.nome = nome;
		this.numeroVittorie=numeroVittorie;
	}

	
	public Integer getNumeroVittorie() {
		return numeroVittorie;
	}

	public void setNumeroVittorie(Integer numeroVittorie) {
		this.numeroVittorie = numeroVittorie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
}
