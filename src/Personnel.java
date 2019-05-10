import java.util.ArrayList;

public class Personnel extends Employee {
	
	ArrayList<Employee> liste = new ArrayList<Employee>();
	
	Personnel() {
		
	}
	
	public void ajouterEmployee(Employee employee) {
		liste.add(employee);
	}
	
	public void afficherSalaires() {
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i).calculerSalaire());
		}
	}
	
	public double salaireMoyen() {
		double compteur = 0;
		double total = 0;
		for (int i = 0; i < liste.size(); i++) {
			total += liste.get(i).calculerSalaire();
			compteur++;
		}
		double moyenne = total / compteur;
		return moyenne;
	}
	
	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return 0;
	}
}
