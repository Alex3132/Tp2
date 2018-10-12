/**
 * 
 */
package entity;

/**
 * @author formation
 *
 */
public class AdressePostale {
	
	int numRue;
	String nomRue;
	String nomVille;
	int codeP;
	
	public AdressePostale(int numRue, String nomRue, String nomVille, int codeP) {
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.nomVille = nomVille;
		this.codeP = codeP;
	}
	
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Je suis à "+numRue+" "+nomRue+" à "+codeP+" "+nomVille;
	}




}
