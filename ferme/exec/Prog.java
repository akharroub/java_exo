package exec;

import java.util.ArrayList;
import java.util.Scanner;

import prod.Canard;
import prod.Paon;
import prod.Poulet;
import prod.Volaille;

public class Prog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choix;
		ArrayList<Volaille> list = new ArrayList<Volaille>(7);
		ArrayList<Poulet> listP = new ArrayList<Poulet>(5);
		ArrayList<Canard> listC = new ArrayList<Canard>(4);
		ArrayList<Paon> listPa = new ArrayList<Paon>(3);
		Poulet P = new Poulet(0);
		Canard C = new Canard(0);
		Paon Pa = new Paon(0);
		boolean marche = true;
		double salaire = 0;
		while (marche) {
			System.out.println("===================================");
			System.out.println(
					"1 - Ajouter volaille \n2 - Modifier \n3 - Afficher \n4 - Vendre ou Rendre \n5 - Afficher list \n6 - Fermer programme");
			System.out.println("===================================");
			System.out.println("Saisir votre choix");
			choix = sc.nextInt();
			switch (choix) {
			case 1:
				System.out.println("===================================");
				System.out.println("==== 1 - Poulet \n==== 2 - Canard \n==== 3 - Paon ");
				System.out.println("===================================");
				System.out.println("Saisir votre choix");
				choix = sc.nextInt();
				switch (choix) {
				case 1:
					System.out.println("====================================");
					System.out.println("========== Ajouter Poulet ==========");
					System.out.println("====================================");
					if (list.size() < 7) {
						if (listP.size() < 5) {
							System.out.println("Saisir le poid du poulet");
							double p = sc.nextDouble();

							P.ajouterPoulet(p, listP, list);

							break;
						} else {
							System.out.println("Erreur Nombre de poulets MAX");
						}
					}else {
						System.out.println("Erreur les cages sont pleines");

					}

					System.out.println("====================================");
					break;
				case 2:
					System.out.println("====================================");
					System.out.println("========== Ajouter Canard ==========");
					System.out.println("====================================");

					if (list.size() < 7) {
						if (listC.size() < 4) {
							System.out.println("Saisir le poid du canard");
							double p = sc.nextDouble();
							C.ajouterCanard(p, listC, list);
							break;
						} else {
							System.out.println("Erreur Nombre de Canards MAX");
						}
					}else {
						System.out.println("Erreur les cages sont pleines");
					}
					System.out.println("====================================");
					break;
				case 3:
					System.out.println("====================================");
					System.out.println("==== 3 - Ajouter Paon");
					System.out.println("====================================");
					if (list.size() < 7) {
						if (listPa.size() < 3) {
							System.out.println("Saisir le poid du paon");
							double p = sc.nextDouble();
							Pa.ajouterPaon(p, listPa, list);
							break;
						} else {
							System.out.println("Erreur Nombre de paons MAX");
						}
					}else {
						System.out.println("Erreur les cages sont pleines");
					}
					System.out.println("====================================");
					break;
				default:
					System.out.println("Erreur le choix saisie n existe pas \nMenu principal \n");
					continue;
				}
				break;
			case 2:
				System.out.println("====================================");
				System.out.println(
						"==== 1 - Modifier prix du jour du Canard \n==== 2 - Modifier prix du jour du Poulet \n==== 3 - Modifier poids d une volaille \n==== 4 - Modifier le poids min d abatage");

				System.out.println("====================================");
				System.out.println("Saisir votre choix");
				choix = sc.nextInt();
				switch (choix) {
				case 1:
					System.out.println("====================================");
					System.out.println("= Modifier prix du jour du Canard (Euro/kg) =");
					System.out.println("====================================");
					System.out.println("Saisir le nouveau montant ");
					double newPrice1 = sc.nextDouble();
					for (Canard c : listC) {
						c.setPridujourC(newPrice1);
					}System.out.println("Changement de prix effectuee");
					System.out.println("====================================");
					break;
				case 2:
					System.out.println("====================================");
					System.out.println("= Modifier prix du jour du Poulet =");
					System.out.println("====================================");
					System.out.println("Saisir le nouveau montant ");
					double newprice2 = sc.nextDouble();
					for (Poulet po : listP) {
						po.setPridujour(newprice2);

					}System.out.println("Changement de prix effectuee");
					System.out.println("====================================");
					break;
				case 3:
					System.out.println("====================================");
					System.out.println("== Modifier le poid d une volaille ==");
					System.out.println("====================================");
					System.out.println(list);
					System.out.println("Saisir l ID de la volaille a modifier(poids)");
					int id = sc.nextInt();
					System.out.println("Saisir le nouveau poids");
					double npoids = sc.nextDouble();
					for (Volaille v : list) {

						if (v.getCpt() == id) {



							v.setPoids(npoids);
							System.out.println("Changement Effectuee");
							break;
						}else {
							System.out.println("Id Introuvable");
						}
							
							
						
					}
					
					System.out.println("====================================");
					break;
				case 4: 
					System.out.println("====================================");
					System.out.println("== Modifier le poids min d abatage ==");
					System.out.println("====================================");
					System.out.println("Saisir le nouveau poid");
					double npm = sc.nextDouble();
					for (Volaille v : list) {
						v.setPoidsmax(npm);
					}
					System.out.println("====================================");
					break;
				default:
					System.out.println("Erreur le choix saisie n existe pas \nMenu principal \n");
					continue;
				}
				System.out.println("====================================");
				break;
			case 3:
				System.out.println("====================================");
				System.out.println(
						"==== 1 - Afficher nombre de volaille par type \n==== 2 - Afficher le total (prix) des volailles possédées");
				System.out.println("====================================");
				System.out.println("Saisir votre choix");
				choix = sc.nextInt();
				switch (choix) {
				case 1:
					System.out.println("====================================");
					System.out.println("Afficher nombre de volaille par type");
					System.out.println("Il y a " + listP.size() + " Poulets \nIl y a " + listC.size()
					+ " Canards \nIl y a " + listPa.size() + " Paon.");
					System.out.println("====================================");
					break;
				case 2:
					System.out.println("====================================");
					System.out.println(" Afficher total (prix) des volailles possedées ");
					System.out.println("====================================");
					double res = 0;
					double res1 = 0;
					for (Canard c : listC) {
						res1 = res1 + (c.getPoids() * c.getPridujourC());

					}
					for (Poulet p : listP) {
						res = res + (p.getPoids() * p.getPridujour());

					}
					res = res + res1;
					System.out.println("le prix total est de : " + res + " pour " + listC.size() + " Canard(s)  et "
							+ listP.size() + " Poulet(s)");
					System.out.println("====================================");
					break;

				default:
					System.out.println("Erreur le choix saisie n existe pas \nMenu principal \n");
					continue;
				}
				break;
			case 4:
				System.out.println("====================================");
				System.out.println("==== 1 - Vendre volaille \n==== 2 - Rendre paon");
				System.out.println("====================================");
				System.out.println("Saisir votre choix");
				choix = sc.nextInt();
				switch (choix) {
				case 1:
					System.out.println("====================================");
					System.out.println("========= Vendre Volaille =========");
					System.out.println("====================================");
					System.out.println(listP);
					System.out.println(listC);

					System.out.println("====================================");
					System.out.println("Saisir l ID Recherche");
					int id = sc.nextInt();
					for (Poulet p : listP) {

						if (p.getCpt() == id) {
							if (p.getPoids() > p.getPoidsmax()) {

								salaire = salaire + p.getPoids() * p.getPridujour();
								list.remove(p);
								listP.remove(p);
								System.out.println("Vente Effectuee votre porte monaie est de "+salaire+ " Euro");

								break;
							}else {
								System.out.println("Erreur le poid est trop petit");
								break;	
							}
						}else {


						}
					}
					for (Canard c : listC) {

						if (c.getCpt() == id) {
							if (c.getPoids() > c.getPoidsmax()) {
								salaire = salaire + c.getPoids() * c.getPridujourC();
								list.remove(c);
								listC.remove(c);
								System.out.println("Vente Effectuee votre porte monaie est de "+salaire+ " Euro");
								break;
							}else {
								System.out.println("Erreur le poid est trop petit");
								break;	
							} 
						}else {

						}
					}




					System.out.println("====================================");
					break;
				case 2:
					System.out.println("====================================");
					System.out.println("========== Rendre paon =============");
					System.out.println("====================================");
					System.out.println(listPa);
					System.out.println("Saisir l ID du paon");
					int id1 = sc.nextInt();
					for (Paon pa : listPa) {

						if (pa.getCpt() == id1) {


							list.remove(pa);
							listPa.remove(pa);
							salaire = salaire + 200;
							System.out.println("Vente effectuee");

							break;

						}else {
							System.out.println("Id introuvable");
							break;
						}
					}

					System.out.println("votre porte monaie est de " + salaire + " Euro ");
					System.out.println("====================================");
					break;
				default:
					System.out.println("Erreur le choix saisie n existe pas \nMenu principal \n");
					continue;
				}
				break;
			case 5:
				System.out.println("====================================");
				System.out.println(
						"==== 1 - Afficher Toute les volailles \n==== 2 - Afficher tout les poulets \n==== 3 - Afficher tout les canards \n==== 4 - Afficher tout les paons");
				System.out.println("====================================");
				System.out.println("Saisir votre choix");
				choix = sc.nextInt();
				switch (choix) {
				case 1:
					System.out.println("Afficher toute les volailles");
					for (Volaille v : list) {
						System.out.println(v);
					}
					System.out.println("====================================");
					break;
				case 2:
					System.out.println("====================================");
					System.out.println("Afficher tout les poulets");
					System.out.println("====================================");
					for (Poulet p : listP) {
						System.out.println(p);
					}
					System.out.println("====================================");
					break;
				case 3:System.out.println("====================================");
				System.out.println("Afficher tout les canards");
				System.out.println("====================================");
				for (Canard c : listC) {

					System.out.println(c);
				}
				System.out.println("====================================");
				break;
				case 4:
					System.out.println("====================================");
					System.out.println("Afficher tout les paons");
					System.out.println("====================================");
					for (Paon paon : listPa) {
						System.out.println(paon);
					}
					System.out.println("====================================");
					break;
				default:
					System.out.println("Erreur le choix saisie n existe pas \nMenu principal \n");
					continue;
				}
				break;
			case 6:
				System.out.println("====================================");
				System.out.println("Merci, Au revoir");
				marche=false;
				System.out.println("====================================");
				return;
			default:

			}
		}
	}

}
