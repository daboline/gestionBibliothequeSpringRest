/**
 * 
 */
package com.daboline.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daboline.entity.Livre;

/**
 * @author daboline-pc
 *
 */
public interface ILivreDao extends JpaRepository<Livre, Long>{
	public Livre findByNomLivre(String nomLivre);
	

}
