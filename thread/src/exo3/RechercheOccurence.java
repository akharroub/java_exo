package exo3;

//import java.util.ArrayList;
//import java.util.List;
//
//public class Occurence<T> extends Thread{
//
//	public List<T> getTab() {
//		return tab;
//	}
//
//
//
//	private List<T> tab;
//	private static final Integer TAILLE_MIN = 40;
//
//
//	public Occurence() {
//		this.tab = new ArrayList<>();
//	}
//	public void ajouter(T a) {
//		tab.add(a);
//	}
//
//	public int compteurChar(List<T> str,T ch) {
//		int compteur = 0;                  
//		for (int i = 0; i < str.size(); i++) 
//			if (str.get(i).equals(ch))             
//				compteur++;                         
//		return compteur;   
//	}
//	
//
//	@Override
//	public void run() {
//		int nbr_occur = 0;
//		nbr_occur = this.compteurChar(this.tab, (T) "mohamed");
//		
//		System.out.println ("Nombre de 'a' dans le texte= "+nbr_occur);
//
//	}
//
//
//
//	public static void main(String[] args) {
//
//
//		//String chara="mohamed akharroub ajbjafjhoahohojanojn jfbhjfvdaygbiagauybgfinhfatfytaatyauhuhiuezhdaaaoh,hauzgbaeuahnuaheyazgfvdabnaiudauoh fvau viag bigfytfaaaihnauhaiuafuoanau aygbauhfifgfvaygfanfbfiufufe";
//
//		Occurence<String> c1 = new Occurence<>();
//		
//		
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		c1.ajouter("mohamed");
//		
//		
//		
//
//		
//		//for (int i = 0; i < chara.length(); i++) {
//			c1.start();
//		//}
//
//		
//
//
//	}
//
//}



import java.util.Arrays;
import java.util.Random;
public class RechercheOccurence<T> implements Runnable {
    private static final int TAILLE_MIN = 100;
    private final T[] donneesTab;
    private final int indexDebut;
    private final int indexFin;
    private final T valeurRecherchee;
    private static int nbOccurences;
    public RechercheOccurence(T[] td,T v, int indD, int indF) {
        this.donneesTab = td;
        this.indexDebut = indD;
        this.indexFin = indF;
        this.valeurRecherchee = v;
    }
    @Override
    public void run() {
        rechercheOccurence();
        System.out.println(Thread.currentThread().getName()+" terminé");
    }
    public void rechercheOccurence() {
        for(int i=this.indexDebut; i<this.indexFin; i++) {
            if(this.valeurRecherchee.equals(this.donneesTab[i])) {
                synchronized (donneesTab) {
                    nbOccurences++;
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        final int tailleDonnees = 101;
        final String valeurRecherchee = "3";
        String[] donnees = new String[tailleDonnees];
        Random r = new Random();
        for(int i=0; i<tailleDonnees; i++) {
            donnees[i] = Integer.toString(r.nextInt(20));
        }
        
        if(tailleDonnees > TAILLE_MIN) {
            RechercheOccurence<String> chercheur1 = new RechercheOccurence<String>(donnees, valeurRecherchee, 0, tailleDonnees/2);
            Thread t1 = new Thread(chercheur1);
            RechercheOccurence<String> chercheur2 = new RechercheOccurence<String>(donnees, valeurRecherchee, tailleDonnees/2, tailleDonnees);
            Thread t2 = new Thread(chercheur2);
            
            t1.start();
            t2.start();
            
            t1.join();
            t2.join();
        } else {
            RechercheOccurence<String> chercheur = new RechercheOccurence<String>(donnees, valeurRecherchee, 0, tailleDonnees);
            chercheur.rechercheOccurence();
        }
        
        System.out.println("la valeur "+valeurRecherchee+" est presente "+RechercheOccurence.nbOccurences+" fois dans le tableau :");
        System.out.println(Arrays.toString(donnees));
    }
}
