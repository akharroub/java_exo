package personne;

public abstract  class Personne implements Comparable<Personne>  {

	protected String nom;
	protected String prenom;
	
	public Personne(String n, String p) {
		this.nom = n;
		this.prenom = p;
	}
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@Override
	public String toString() {
		return ""+prenom+" "+ nom  ;
	}
}
