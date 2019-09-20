package personne;

public class Employe extends Personne {

	protected double salaire;

	public Employe (String n, String p,double s) {
		super (n,p);
		this.salaire=s;

	}

	@Override
	public String toString() {
		return "Je suis l'employé " +super.toString()+" mon salaire est : "+ salaire+" euro";
	}

	public double getSalaire() {
		return this.salaire;
	}

	@Override
	public int compareTo(Personne o) {
		if (o instanceof Etudiant) {
			return -1; 
		} else if (o instanceof Professeur) {
			return -2;
		} else {
			return this.nom.compareTo(((Employe) o).nom);
		}
	}

}
