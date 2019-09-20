package prod;

import java.util.ArrayList;

public class Canard extends Volaille {
	protected double pridujourC;

	public Canard(double poids) {
		super(poids);
		// TODO Auto-generated constructor stub
	}

	public double vendreCanard(Canard A) {

		return A.poids * A.pridujourC;

	}

	public double getPridujourC() {
		return pridujourC;
	}

	public void setPridujourC(double pridujourC) {
		this.pridujourC = pridujourC;
	}

	@Override
	public String toString() {
		return "Canard : " + super.toString();
	}

	public void ajouterCanard(double poid, ArrayList<Canard> listP, ArrayList<Volaille> list) {
		Canard p = new Canard(poid);
		list.add(p);
		listP.add(p);
		System.out.println("Ajout Effectuer");
	}

}
