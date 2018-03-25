/**
 * 
 */
package com.daboline.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daboline.dao.IBibliothequeDao;
import com.daboline.entity.Bibliotheque;
import com.daboline.entity.Livre;

/**
 * @author daboline-pc
 *
 */

@RestController
@CrossOrigin("*")
public class BiblioService {
	@Autowired
	IBibliothequeDao bibliothequeDao;
	Bibliotheque biblio = new Bibliotheque();

	/**
	 * ajout de bibliotheque
	 */
	@RequestMapping(value = "/Ajoutbiblio", method = RequestMethod.POST)
	public Bibliotheque ajoutBiblio(@RequestBody Bibliotheque bibliotheque) {
		return bibliothequeDao.save(bibliotheque);

	}

	/**
	 * lister bibliotheque
	 */
	@RequestMapping(value = "/listesbiblio", method = RequestMethod.GET)
	public List<Bibliotheque> ListesBibliotheque() {
		return bibliothequeDao.findAll();

	}

	/**
	 * lister livre dans bibio
	 */
	@RequestMapping(value = "/listeslivresbiblio/{idbiblio}", method = RequestMethod.GET)
	public List<Livre> ListlivresBibliotheque(@PathVariable("idbiblio") long idBibliotheque) {
		List<Livre> l = new ArrayList<>();
		biblio = bibliothequeDao.findById(idBibliotheque);
		l = biblio.getListelivre();
		// for(int i = 0 ; i < l.size(); i++) {
		// l.addAll(l);
		// }
		return l;
	}

	/**
	 * chercher bibliotheque par id
	 */
	@RequestMapping(value = "/listesbiblio/{id}", method = RequestMethod.GET)
	public Bibliotheque chercheBibliotheque(@PathVariable Long id) {
		return bibliothequeDao.findOne(id);

	}

	/**
	 * suppression bibliotheque par id
	 */
	@RequestMapping(value = "/supprimebiblio/{id}", method = RequestMethod.DELETE)
	public Boolean supprimeBibliotheque(@PathVariable Long id) {
		bibliothequeDao.delete(id);
		return true;

	}

	/**
	 * mise a jour bibliotheque par id
	 */
	@RequestMapping(value = "/modification/{id}", method = RequestMethod.PUT)
	public Bibliotheque modifBibliotheque(@PathVariable Long id, @RequestBody Bibliotheque b) {
		b.setId(id);
		return bibliothequeDao.saveAndFlush(b);

	}
	

}
/**
 * recherche bibliotheque
 */
// @RequestMapping(value="/recherchebiblio/" , method=RequestMethod.GET)
// public Page<Bibliotheque> chercher(@RequestParam(name="mc", defaultValue="")
// String mc, @RequestParam(name="page", defaultValue="0") int page,
// @RequestParam(name="size", defaultValue="5") int size) {
// return bibliothequeDao.chercher("%"+mc+"%", new PageRequest(page, size));
//
//
//
//
// }

/**
 * ajout livre dans bibio
 * 
 * @RequestMapping(value="/ajoutlivresbiblio/{biblioth}/{livrebiblio}" ,
 * method=RequestMethod.POST) public List<Livre> ajoutLivresBibliotheque
 * (@PathVariable("biblioth") String nomBibliotheque,@RequestBody Livre livre) {
 * List<Livre> l=new ArrayList<>(); l.add(livre); biblio=
 * bibliothequeDao.findByNom(nomBibliotheque); biblio.setListelivre(l);
 * bibliothequeDao.save(biblio);
 * 
 * 
 * return ListlivresBibliotheque(biblio.getNom()); }
 * 
 */
