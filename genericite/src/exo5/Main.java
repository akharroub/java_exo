package exo5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		int typeChoisi = 0;
		String saisie = null;

		Ensemble<String> ensembl = new Ensemble<>();
		Ensemble<Integer> ensembl1 = new Ensemble<>();
		Ensemble<Double> ensemble2 = new Ensemble<>();

		boolean continuer = true;

		while (continuer) {
			System.out.println("1-crée un ensemble");
			System.out.println("2-ajouter un element dans un ensemble");
			System.out.println("3-supprime un element dans un ensemble");
			System.out.println("4-afficher les elemen de l'ensemble");
			System.out.println("5-arreter");
			saisie = sn.nextLine();

			switch (saisie) {
			case "1":
				System.out.println("1-crée un ensemble de String");
				System.out.println("2-crée un ensemble de Integer");
				System.out.println("3-crée un ensemble de double");
				typeChoisi = sn.nextInt();
				sn.nextLine();
				break;
			case "2":
				System.out.println("ajouter un element ");
				saisie = sn.nextLine();
				switch (typeChoisi) {
				case 1:
					System.out.println(ensembl.ajouter(saisie));
					break;
				case 2:
					System.out.println(ensembl1.ajouter(Integer.parseInt(saisie)));
					break;
				case 3:
					System.out.println(ensemble2.ajouter(Double.parseDouble(saisie)));
					break;
				default:
					break;
				}
				break;
			case "3":
				System.out.println("supprime un element ");
				saisie = sn.nextLine();
				
				switch (typeChoisi) {
				case 1:
					ensembl.remove(saisie);
					break;
				case 2:
					ensembl1.remove(Integer.parseInt(saisie));
					break;
				case 3:
					ensemble2.remove(Double.parseDouble(saisie));
					break;
				default:
					break;
				}
				break;
			case "4":
				switch (typeChoisi) {
				case 1:
					ensembl.afficher();
					break;
				case 2:
					ensembl1.afficher();
					break;
				case 3:
					ensemble2.afficher();
					break;

				default:
					break;
				}
				break;
			case "5":
				continuer = false;
				break;
			default:
				break;
			}
		}
		sn.close();

	}

}
