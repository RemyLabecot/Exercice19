
public class Manutentionnaire extends Employee{
	
	private int heures;
	
	Manutentionnaire() {
		
	}
	
	Manutentionnaire(String nom, String prenom, int age, int annee, int heures) {
		super(nom, prenom, age, annee);
		this.heures = heures;
	}
	
	public double calculerSalaire() {
		
		double salaire = 0;
		salaire = heures * 65;
		return salaire;
	}
}
