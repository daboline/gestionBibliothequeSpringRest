/**
 * 
 */
package com.daboline.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author daboline-pc class Bibliotheque
 *
 */
@Entity
public class Livre implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id ;
	String nomLivre;
	String autheur;
	String domaine;
	int ranger;
	int colonne;


	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Livre(String nomLivre, String autheur, String domaine, int ranger, int colonne) {
		super();
		this.nomLivre = nomLivre;
		this.autheur = autheur;
		this.domaine = domaine;
		this.ranger = ranger;
		this.colonne = colonne;

	}

	/**
	 * getters et setters
	 *
	 */


	public String getNomLivre() {
		return nomLivre;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}


	public String getAutheur() {
		return autheur;
	}


	public void setAutheur(String autheur) {
		this.autheur = autheur;
	}


	public String getDomaine() {
		return domaine;
	}


	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}


	public int getRanger() {
		return ranger;
	}


	public void setRanger(int ranger) {
		this.ranger = ranger;
	}


	public int getColonne() {
		return colonne;
	}


	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	
	
	

}
