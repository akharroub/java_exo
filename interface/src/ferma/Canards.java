package ferma;

import java.util.List;

public class Canards extends Volaille{
	
	protected  double prixdujour;
	protected double poidAbattageC;

	public double getPrixdujour() {
		return prixdujour;
	}

	public void setPrixdujour(double prixdujour) {
		this.prixdujour = prixdujour;
	}

	public Canards(double poids) {
		super(poids);
		// TODO Auto-generated constructor stub
	}

	public void ajouterCanard(double poidDecanard, List<Canards> listeCanards, List<Volaille> listVolailles) {
		int lv = listVolailles.size();
		int tl = listeCanards.size();
		if (lv < 7) {
		if (tl < 4) {
			Canards c1 = new Canards(poidDecanard);
			listeCanards.add(c1);
			listVolailles.add(c1);
			System.out.println("Ajout Effectue"+lv);
		}else {
			System.out.println("Erreur");
		}
	}else {
		System.out.println("erreur");
	}
}

	@Override
	public String toString() {
		return "Canards : "+super.toString();
	}

	public int getNumIdent() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getPoidAbattageC() {
		return poidAbattageC;
	}

	public void setPoidAbattageC(double poidAbattage) {
		this.poidAbattageC = poidAbattage;
	}

	public void modifiePoidAabattage(double poidAbattageC2, List<Canards> listeCanards) {
		
		for (Canards canards : listeCanards) {
			canards.setPoidAbattageC(poidAbattageC);
		}System.out.println("le poid d'abattage et bien modifier");
		
	}
	
	
}

