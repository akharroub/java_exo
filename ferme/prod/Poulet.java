
package prod;
import java.util.ArrayList;
public class Poulet extends Volaille {
	protected  double pridujour;
	public Poulet(double poids) {
		super(poids);

	}
	public double vendrePoulet(Poulet A) {


		return A.poids*A.pridujour;

	}

	@Override
	public String toString() {
		return "Poulet : "+ super.toString();
	}
	public double getPridujour() {
		return pridujour;
	}
	public void setPridujour(double pridujour) {
		this.pridujour = pridujour;
	}
	public void ajouterPoulet(double poid, ArrayList<Poulet> listP, ArrayList<Volaille> list) {
		Poulet p = new Poulet(poid);
		list.add(p);
		listP.add(p);
		System.out.println("Ajout Effectuer");
	}
}