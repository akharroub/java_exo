package exo2;

public class Main {

	public static void main(String[] args) {
		
		String [] tabString = new String[3];
		tabString[0]="toto";
		tabString[1]="tata";
		tabString[2]="titi";
		System.out.println(MetodeGenerique.methodeTableauHasar(tabString));
		
		int a = 2;
		int b = 5;
		System.out.println(MetodeGenerique.methodeHasard(a, b));

	}

}
