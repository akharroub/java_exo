package exo2;

import java.util.Random;

public class MetodeGenerique {
	
	public static <T> T methodeTableauHasar(T[] tab) {
		int index = new Random().nextInt(tab.length);
		return tab[index];
		
	}
	
	public static <E> E methodeHasard( E x,E y) {
		double d = Math.random();
		if (d > 0.5) {
			return x;
		}else {
			
			return y;
		}
		
		
	}
	
	
	

}
