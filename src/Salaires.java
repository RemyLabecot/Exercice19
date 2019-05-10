
public class Salaires {
	public static void main(String[] args) {
		
		Personnel p = new Personnel();
		 p.ajouterEmployee(new Vendeur("Terrieur", "Alex", 45, 1995, 30000));
		 p.ajouterEmployee(new Representant("Terrieur", "Alain", 25, 2001, 20000));
		 p.ajouterEmployee(new Producteur("Bosseur", "Yves", 28, 1998, 1000));
		 p.ajouterEmployee(new Manutentionnaire("Stocketout", "Jeanne", 32, 1998, 45));
		 p.ajouterEmployee(new ProdARisque("Flippe", "Jean", 28, 2000, 1000));
		 p.ajouterEmployee(new ManutARisque("Abordage", "Al", 30, 2001, 45));
		 p.afficherSalaires();
		 System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " francs.");
	}
}
