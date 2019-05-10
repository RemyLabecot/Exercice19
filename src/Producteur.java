
public class Producteur extends Employee{
	
	private int unit;
	
	Producteur() {
		
	}
	
	Producteur(String nom, String prenom, int age, int annee, int unit) {
		super(nom, prenom, age, annee);
		this.unit = unit;
	}
	
	public double calculerSalaire() {
		double salaire = 0;
		salaire = unit * 5;
		return salaire;
	}
}
