/**
 * 
 */
package com.daboline.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author daboline-pc
 *
 */
@Entity
public class Bibliotheque implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String nom;
	private String ecole;
	
	@OneToMany(cascade=CascadeType.REMOVE)
	private List<Livre> listelivre;
	
	public Bibliotheque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	public Bibliotheque(String nom, String ecole) {
		super();
		this.nom = nom;
		this.ecole = ecole;
	}
	
	/**
	 * getters et setters
	 *
	 */
	
	
	
	public List<Livre> getListelivre() {
		return listelivre;
	}

	public void setListelivre(List<Livre> listelivre) {
		this.listelivre = listelivre;
	}

	
	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	
	

}
