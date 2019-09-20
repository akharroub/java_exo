package personne;

public class Etudiant extends Personne  {

	protected int cne;

	public Etudiant (String n, String p,int c) {
		super (n,p);
		this.cne=c;
	}

	@Override
	public String toString() {
		return "Je suis l'étudiant "+super.toString()+" mon CNE est : " + cne;
	}

	@Override
	public int compareTo(Personne o) {
		if (o instanceof Professeur) {
			return -1;
		
		} else if (o instanceof Employe) {
			return 1; 
			
		} else {
			return (this.nom).compareTo(((Etudiant) o).nom);
		}
	}

}
