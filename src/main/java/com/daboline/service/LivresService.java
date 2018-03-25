/**
 * 
 */
package com.daboline.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daboline.dao.IBibliothequeDao;
import com.daboline.dao.ILivreDao;
import com.daboline.entity.Bibliotheque;
import com.daboline.entity.Livre;

/**
 * @author daboline-pc
 *
 */
@RestController
@CrossOrigin("*")
public class LivresService {

	
	@Autowired
	ILivreDao livreDao;
	@Autowired
	IBibliothequeDao bibliothequeDao;

	/**
	 * ajout de livre
	 */
	@RequestMapping(value="/Ajoutlivre" , method=RequestMethod.POST)
	public Livre ajoutBiblio(@RequestBody Livre livre ) {
		return livreDao.save(livre);
	
	}

	/**
	 * lister  livre
	 */
	@RequestMapping(value="/listeslivre" , method=RequestMethod.GET)
	public List<Livre> ListesLivre () {
		return livreDao.findAll();
	
	}
	
	/**
	 * chercher   bibliotheque par id
	 */
	@RequestMapping(value="/listeslivres/{id}" , method=RequestMethod.GET)
	public Livre chercherLivre (@PathVariable Long id) {
		return livreDao.findOne(id);
	
	}
	
	/**
	 * suppression   bibliotheque par id
	 */
	@RequestMapping(value="/supprimelivre/{id}" , method=RequestMethod.DELETE)
	public Boolean supprimeBibliotheque (@PathVariable Long id) {
		 livreDao.delete(id);
		 return true;
	
	}
	
	/**
	 * ajout de livre a la biblio
	 */
	@RequestMapping(value="/ajoutlivrepourbiblio/{biblioCible}" , method=RequestMethod.POST)
	public Livre ajoutLivrePourBiblio(@PathVariable long biblioCible ,@RequestBody Livre livre) {
		List <Livre> listeLivre= new ArrayList<>();
		
		livreDao.saveAndFlush(livre);
		

		Bibliotheque b=bibliothequeDao.findById(biblioCible);
		//b.setId(biblioCible);
		listeLivre=b.getListelivre();
		b.setListelivre(listeLivre);
		listeLivre.add(livre);
		

		bibliothequeDao.saveAndFlush(b);

		return livre; 
	
	}
	
	/**
	 * MISE A JOUR  livre
	 */
	@RequestMapping(value="/modifierlivre/{livreCible}" , method=RequestMethod.PUT)
	public Livre modifierLivre(@PathVariable long livreCible ,@RequestBody Livre livre) {
		livre.setId(livreCible);
		livreDao.saveAndFlush(livre);
		return livre; 
	
	}
	
	
//	@RequestMapping(value="/ajoutlivrepourbiblio{biblioCible}" , method=RequestMethod.POST)
//	public Livre ajoutLivrePourBiblio(@RequestBody Livre livre ,@RequestBody Bibliotheque b) {
//		List <Livre> listeLivre= new ArrayList<>();
//		listeLivre.add(livre);
//		b.setListelivre(listeLivre);
//		bibliothequeDao.saveAndFlush(b);
//		return livreDao.save(livre);
	
		
	/**
	 * recherche   bibliotheque 
	 */
//	@RequestMapping(value="/recherchebiblio/" , method=RequestMethod.GET)
//	public Page<Bibliotheque> chercher(@RequestParam(name="mc", defaultValue="") String mc, @RequestParam(name="page", defaultValue="0") int page, 
//			                           @RequestParam(name="size", defaultValue="5") int size) {
//				return bibliothequeDao.chercher("%"+mc+"%", new PageRequest(page, size));
//				
//		
//		
//	
//	}
	
	
}
