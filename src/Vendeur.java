
public class Vendeur extends Employee{
	
	private double ca;
	
	
	Vendeur() {
		
	}
	
	Vendeur(String nom, String prenom, int age, int annee, double ca) {
		super(nom, prenom, age, annee);
		this.ca = ca;
	}
	
	public double calculerSalaire() {
		
		double salaire = 0;
		salaire = ca *0.20+400;
		return salaire;
	}
}
