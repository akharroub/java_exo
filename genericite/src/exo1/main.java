package exo1;

public class main {

	public static void main(String[] args) {
		
		Triplet<String> tr1= new Triplet<>("momo", "bobo", "toto");
		
		Triplet<Integer> tr2 = new Triplet<>(1, 2, 3);
		
		Triplet<Double> tr3 = new Triplet<>(1.1, 2.2, 3.3);
		
		
		TripletH<String , Integer, Double> tr4 = new TripletH<>("mohamed", 32, 84.5);

		TripletH<Integer, String, Character> tr5 = new TripletH<>(28, "Yassin", 'y');
		
		
		System.out.println("***********************************************************");
		
		tr1.affichage();
		tr2.affichage();
		tr3.affichage();
		
		System.out.println("*********************************************************");
		
		tr4.affichage();
		tr5.affichage();
	}

}
