/**
 * 
 */
package entity;

/**
 * @author formation
 *
 */
public class Personne {

	String nom;
	String prenom;
	AdressePostale adresse;
	
	public Personne(String nom, String prenom, AdressePostale adresse) {

		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
 
	public String toString() {
		return this.nom+"\n"+this.prenom+"\n"+this.adresse;
		
	}
}
