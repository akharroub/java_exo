package exo3;

public class CoupleNomme<T> extends Couple<T> {
	
private String nom;

	public CoupleNomme(T premier, T second,String n) {
		super(premier, second);
		this.nom = n;
		
	}
	
	public void affiche (){
		System.out.println("nom : "+nom);
		super.affiche();
	}

}
