package eu.ensup.formulaire.service;

import java.util.ArrayList;

import eu.ensup.formulaire.dao.ConseillerDao;
import eu.ensup.formulaire.dao.GerantDao;
import eu.ensup.formulaire.domaine.Personne;



/**
 * @author benja
 * Classe service de Gérant
 */
public class GerantService {

	GerantDao gerantDao = new GerantDao();
	
	//Renvoie la liste des conseillers
	/**
	 * @return
	 * Méthode listeDesConseillers() utilisant la méthode listeDesConseillers() du Dao {@link GerantDao}
	 */
	public ArrayList<Personne> listeDesConseillers() {
		
		ArrayList<Personne> listePersonnes = new ArrayList<Personne>();
		listePersonnes = gerantDao.listeDesConseillers();
		return listePersonnes;
	}
}
