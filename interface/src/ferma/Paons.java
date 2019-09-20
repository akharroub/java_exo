package ferma;

import java.util.List;

public class Paons extends Volaille{

	public Paons(double poids) {
		super(poids);

	}

	public void ajouterPaons(double poidDePaon, List<Paons> listePaons, List<Volaille> listVolailles) {
		int lv = listVolailles.size();
		int tp = listePaons.size();

		if (lv < 7) {
			
		if(tp < 5) {
			Paons p1 = new Paons(poidDePaon);
			listePaons.add(p1);
			listVolailles.add(p1);
			System.out.println("Ajout Effectue "+poidDePaon);
		}else {
			System.out.println("erreur");
		}
		}else {
			System.out.println("erreur");
		}
	}

	@Override
	public String toString() {
		return "Paons : "+super.toString();
	}
	
}



