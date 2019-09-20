package personne;

public class Professeur extends Employe   {

	protected String spec;

	public Professeur (String n, String p,double sal,String sp) {
		super (n,p,sal);
		this.spec=sp;
	}

	@Override
	public String toString() {
		return  "Je suis le professeur "+getPrenom()+" "+getNom()+" mon salaire est : "+getSalaire()+" ma spécilalité est : " + spec;
	}

	@Override
	public int compareTo(Personne o) {
		if (o instanceof Etudiant) {
			return 1; 
		} else if (o instanceof Professeur) {
			return this.nom.compareTo(((Professeur) o).nom);
		} else {
			return 2;
		}
	}

}
