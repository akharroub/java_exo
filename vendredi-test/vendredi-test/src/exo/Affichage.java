package exo;

import java.util.function.Predicate;

public class Affichage {

//		private static void affichageSelectif(int[] tab, IAffichage a) {
//			for (int i : tab) {
//				if(a.Iaffichage(i)) {
//					System.out.print(i+" * ");
//			}
//			}
//
//		}
		private static void affichageSelectif2(int[] tab, Predicate<Integer> a) {
			for (int i : tab) {
				if (a.test(i)) {
					System.out.print(i +" * ");
				}
			}
			
		}




	public static void main(String[] args) {

		int [] tab = {1, 4, -2, 9, -3, 5, -3, 12, -11,7, 6,0 } ;
		
		
		//en etulisone l'nterface IAffichage
		System.out.println("-- Les positifs :");
		System.out.println("\n"+"-- Les négatifs :");
		System.out.println("\n"+"-- Les pairs :");
		
		System.out.println("\n"+"**************************************************");
		
		
		
//		
		System.out.println("-- Les positifs :");
		affichageSelectif2(tab,IAffichage::positif);
		System.out.println("\n"+"ma methode");
		affichageSelectif2(tab, ee -> ee > 0) ;
		
		System.out.println("\n"+"-- Les négatifs :");
		affichageSelectif2(tab, IAffichage::negatif);
		System.out.println("\n"+"ma methode");
		affichageSelectif2(tab, ee -> ee < 0) ;
		
		System.out.println("\n"+"-- Les pairs :");
		affichageSelectif2(tab, IAffichage::pair);
		System.out.println("\n"+"ma methode");
		affichageSelectif2(tab, ee -> ee %2 == 0) ;
		

	}


}
