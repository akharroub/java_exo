package ferma;

import java.util.List;

public class Poulets extends Volaille{
	
	protected  double prixdujour;
	protected double poidAbattage;
	
	public double getPrixdujour() {
		return prixdujour;
	}

	public void setPrixdujour(double prixdujour) {
		this.prixdujour = prixdujour;
	}

	public Poulets(double poids) {
		super(poids);
		// TODO Auto-generated constructor stub
	}

	public void ajouterPoulet(double poidDePoulet, List<Poulets> listePoulets, List<Volaille> listVolailles) {
		int lv = listVolailles.size();
		int tp = listePoulets.size();
		if (lv < 7) {
		if(tp < 5) {
			Poulets p1 = new Poulets(poidDePoulet);
			listePoulets.add(p1);
			listVolailles.add(p1);
			System.out.println("Ajout Effectue "+listePoulets);
		}else {
			System.out.println("erreur");
		}	
	}else {
		System.out.println("erreur");
	}
}

	@Override
	public String toString() {
		return "Poulets :"+super.toString();
	}

	public double getPoidAbattage() {
		return poidAbattage;
	}

	public void setPoidAbattage(double poidAbattage) {
		this.poidAbattage = poidAbattage;
	}
	
}

