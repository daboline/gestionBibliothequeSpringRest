/**
 * 
 */
package com.daboline.dao;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.daboline.entity.Bibliotheque;
import com.daboline.entity.Livre;

/**
 * @author daboline-pc
 *
 */
public interface IBibliothequeDao extends JpaRepository<Bibliotheque, Long> {
	public List<Livre> findByListelivre(String bibliothequeNom);
	//public Livre findByNom(String livre);
	public Bibliotheque findByNom(String bibliothequeNom);
	public Bibliotheque findById(long idBibliotheque);

	

//	@Query("selec b from Bibliotheque b where b.nom like:x ")
//	public Page<Bibliotheque> chercher(@Param ("x") String mc, Pageable pageable);


}
