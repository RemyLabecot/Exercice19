
public class ProdARisque extends Producteur implements PrimeDeRisque {

	private int unit;
	
	ProdARisque() {

	}
	
	ProdARisque(String nom, String prenom, int age, int annee, int unit) {
		super(nom, prenom, age, annee, unit);
	}

	public double calculerSalaire() {
		double salaire = super.calculerSalaire();
		return salaire + prime;
	}
	
	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}
}
