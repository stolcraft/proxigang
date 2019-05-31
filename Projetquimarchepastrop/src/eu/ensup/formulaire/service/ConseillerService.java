package eu.ensup.formulaire.service;

import java.util.ArrayList;

import eu.ensup.formulaire.dao.ConseillerDao;
import eu.ensup.formulaire.domaine.Compte;
import eu.ensup.formulaire.domaine.Personne;



/**
 * @author benja
 * Classe service de Conseiller
 */
public class ConseillerService {

	
	ConseillerDao conseillerDao = new ConseillerDao();
	
	/**
	 * @param personne
	 * Méthode creationClient() utilisant la méthode creationClient() du Dao {@link ConseillerDao}
	 * @return
	 */
	public boolean creationClient(Personne personne) {
		// TODO Auto-generated method stub
		conseillerDao.creationClient(personne);
		
		return true;
	}

	/**
	 * @param id
	 * Méthode afficherInfoClient() utilisant la méthode afficherInfoClient() du Dao {@link ConseillerDao}
	 * @return
	 */
	public Personne afficherInfoClient(String id) {
		// TODO Auto-generated method stub
		Personne personne = new Personne();
		personne = conseillerDao.afficherInfoClient(id);

		return personne;
	}

	/**
	 * @param personne
	 *  Méthode modificationClient() utilisant la méthode modificationClient() du Dao {@link ConseillerDao}
	 * @return
	 */
	public boolean modificationClient(Personne personne) {
		// TODO Auto-generated method stub
		conseillerDao.modificationClient(personne);
		return true;
	}

	/**
	 * @param id
	 * Méthode suppressionClient() utilisant la méthode suppressionClient() du Dao {@link ConseillerDao}
	 * @return
	 */
	public boolean suppressionClient(String id) {
		// TODO Auto-generated method stub
		conseillerDao.suppressionClient(id);
		return true;
	}

	/**
	 * Méthode listeDesClients() utilisant la méthode listeDesClients() du Dao {@link ConseillerDao}
	 * @return
	 */
	public ArrayList<Personne> listeDesClients() {
		// TODO Auto-generated method stub
		ArrayList<Personne> listePersonnes = new ArrayList<Personne>();
		listePersonnes = conseillerDao.listeDesClients();
		return listePersonnes;
	}
	
	//Permet d'afficher les comptes d'un client
	/**
	 * @param id
	 *  Méthode listeDesComptes() utilisant la méthode listeDesComptes() du Dao {@link ConseillerDao}
	 * @return
	 */
	public ArrayList<Compte> listeDesComptes(String id)
	{
		ArrayList<Compte> listeDesComptes = new ArrayList<Compte>();
		listeDesComptes = conseillerDao.listeDesComptes(id);
		return listeDesComptes;
		
	}

	
}
