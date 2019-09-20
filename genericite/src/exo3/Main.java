package exo3;

public class Main {

	public static void main(String[] args) {
		
		CoupleNomme<String> co1 = new CoupleNomme<String>("premier", "second", "n");
		co1.affiche();
		
		PointNomme p = new PointNomme(1, 2, "toto");
		p.affiche();
	}

}
