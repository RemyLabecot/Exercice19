
public class ManutARisque extends Manutentionnaire implements PrimeDeRisque {
	
	private int heures;
	
	ManutARisque () {
		
	}
	
	ManutARisque(String nom, String prenom, int age, int annee, int heures) {
		super(nom, prenom, age, annee, heures);
	}
	
	public double calculerSalaire() {
		double salaire = super.calculerSalaire();
		return salaire + prime;
	}
	
	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}
}
