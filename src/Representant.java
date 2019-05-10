
public class Representant extends Employee{
	
	private double ca;
	
	Representant() {
		
	}
	
	Representant(String nom, String prenom, int age, int annee, double ca) {
		super(nom, prenom, age, annee);
		this.ca = ca;
	}
	
	public double calculerSalaire() {
	
		double salaire = 0;
		salaire = ca *0.20+800;
		return salaire;
	}
	
	public double getCa() {
		return ca;
	}
	
	public void setCa(double ca) {
		this.ca = ca;
	}
}
