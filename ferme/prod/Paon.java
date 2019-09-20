package prod;

import java.util.ArrayList;

public class Paon extends Volaille{
    public Paon(double poids) {
        super(poids);
        // TODO Auto-generated constructor stub
    }

	public void ajouterPaon(double poid, ArrayList<Paon> listPa, ArrayList<Volaille> list) {
		Paon p = new Paon(poid);
	    list.add(p);
	    listPa.add(p);
	    System.out.println("Ajout Effectuer");
		
	}

	@Override
	public String toString() {
		return "Paon : "+super.toString();
	}
}