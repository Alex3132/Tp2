/**
 * 
 */
package main;

import entity.*;

/**
 * @author formation
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AdressePostale adresse = new AdressePostale(2, "Lafayette", "Toulouse", 31000);
		adresse.affiche();
		//adresse.affiche();
		
		Personne alex = new Personne("Zueras", "alexis", adresse);
		System.out.println(alex);
	
	}

}
