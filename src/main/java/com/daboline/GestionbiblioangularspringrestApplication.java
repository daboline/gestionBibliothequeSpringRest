package com.daboline;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.daboline.dao.IBibliothequeDao;
import com.daboline.dao.ILivreDao;
import com.daboline.entity.Bibliotheque;
import com.daboline.entity.Livre;



@SpringBootApplication
public class GestionbiblioangularspringrestApplication  implements CommandLineRunner{
/*	@Autowired
	private ILivreDao livreDao;
	@Autowired
	private  IBibliothequeDao bibliothequeDao;*/

	
	public static void main(String[] args) {
		SpringApplication.run(GestionbiblioangularspringrestApplication.class, args);
	}

	
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		/* 
		 * creation bibliotheque
		 */
		
		/*Bibliotheque b1=bibliothequeDao.save(new Bibliotheque("BibliothequeESMT", "ESMT"));
		Bibliotheque b2=bibliothequeDao.save(new Bibliotheque("BibliothequeObjis", "Objis"));
		*/
		
		
		/* 
		 * creation livre
		 */
		
		/*List <Livre> listeLivre= new ArrayList<>();
		List <Livre> listeLivre2= new ArrayList<>();

		listeLivre.add(livreDao.save(new Livre("JPA et Java Hibernate", "Martial BANON" , "informatique", 1, 1)));
		listeLivre.add(livreDao.save(new Livre("Java et Spring", "Adrien Meaudre" , "informatique", 1, 2)));
		listeLivre.add(livreDao.save(new Livre("Développer des services REST en Java", " Aurélie Sobréro" , "informatique", 2, 4)));
		listeLivre2.add(livreDao.save(new Livre("La gestion de projet", "Alexandre Faulx-Briole " , "gestion de projet", 5, 2)));
		listeLivre2.add(livreDao.save(new Livre("Angular 2", "Cédric Millauriaux" , "informatique", 4, 8)));
		
		b1.setListelivre(listeLivre);
		b2.setListelivre(listeLivre2);

		 
		 * enregistrement biblio
		 * 
		 
		bibliothequeDao.save(b1);
		bibliothequeDao.save(b2);
		*/
		
		
//			List<Livre> l=new ArrayList<>();
//			Bibliotheque biblio= bibliothequeDao.findByNom("BibliothequeESMT");
//		
//			 l.add((Livre) bibliothequeDao.findByListelivre(biblio.getNom()));
//			    for (Livre livre : l ) {
//			    	//logger.info(listeclient);
//			    	System.out.println(livre);
//			    }
	}
}
