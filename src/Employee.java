
abstract class Employee {

	protected String nom;
	protected String prenom;
	protected int age;
	protected int annee;
	
	public Employee() {

	}

	public Employee(String nom, String prenom, int age, int annee) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.annee = annee;
	}
	
	public abstract double calculerSalaire();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Employee [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", annee=" + annee + "]";
	}
}
