package exo1;

public class Compteur implements Runnable {

	private static int cpt=1;
	private String nom;
	private int c;


	public Compteur(String nom, int c) {
		this.nom = nom;
		this.c = c;
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < c; i++) {
			System.out.println(this.getNom()+" : "+i);
			try {
				Thread.sleep(10);
			} catch(InterruptedException e){
				System.out.println(e.getMessage());}
		} System.out.println("*** " +this.nom+" a fini de compter jusqu'à " +this.c+" en position "+cpt);
		cpt++;
	}


}
