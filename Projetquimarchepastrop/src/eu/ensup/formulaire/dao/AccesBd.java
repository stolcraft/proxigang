package eu.ensup.formulaire.dao;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.LogManager;

/**
 * @author benja
 * Classe AccesBd
 * Permet d'interagire avec la BDD
 */
public class AccesBd {

	// static final Logger logger = LogManager.getLogger(AccesBd.class.);
	public static Connection cn;
	public static Statement st;

	// TODO Connexion à la BD

	/**
	 * @return
	 * M�thode seConnecter()
	 * Permet de se connecter � la BDD
	 */
	public static Connection seConnecter() {
		
		//

		//System.out.println("Connexion en cours...");

		String url = "jdbc:mysql://localhost:3306/proxybanque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String login = "root";
		String passwd = "";

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Création d'un statement
			st = cn.createStatement();

			System.out.println("Connecté.");
		}

		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("hello");
			e.printStackTrace();
		}

		return cn;
	}

	// TODO Déconnexion à la BD

	/**
	 * M�thode seDeconnecter()
	 * Permet de se d�connecter de la BDD
	 */
	public void seDeconnecter() {
		try {
			cn.close();
			st.close();
			//System.out.println("Déconnecté. \nBye ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
