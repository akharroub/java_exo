package personne;

import java.util.ArrayList;
import java.util.Collections;

public class Application  {

	public static void main(String[] args) {
		ArrayList <Personne> listPers=new ArrayList<> (); 

		Employe ambroise = new Employe ("Delalin","Ambroise",1900);
		Employe francois= new Employe ("Vandenplas","François",1800);
		Etudiant julien = new Etudiant ("Chombart","Julien",65678754);
		Etudiant sebastien = new Etudiant ("Fremy","Sebastien",87543543);
		Professeur oussama = new Professeur("Oussama","Stili",2000 ,"JAVA/JEE");
		Professeur thomas = new Professeur("Savaton","Thomas",2000,"Mathématique");

		listPers.add(ambroise);
		listPers.add(julien);
		listPers.add(oussama);
		listPers.add(sebastien);
		listPers.add(thomas);
		listPers.add(francois);

		System.out.println(listPers);
		
		Collections.sort(listPers);
		System.out.println("apres tri : ************************");
		for (Personne personne : listPers) {
			System.out.println(personne);
		}
	}
	
}
