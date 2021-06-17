package it.uniroma3.siw.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trofeo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String anno;
	
	@ManyToOne
	private Societa societa;
	
	private Integer numeroVittorie;

	public Trofeo() {
	}

	public Trofeo(String nome, String anno, Integer numeroVittorie) {
		this.nome = nome;
		this.anno = anno;
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

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public Societa getSocieta() {
		return societa;
	}

	public void setSocieta(Societa societa) {
		this.societa = societa;
	}
    
}
