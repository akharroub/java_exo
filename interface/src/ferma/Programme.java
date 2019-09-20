package ferma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		List<Volaille> listVolailles = new ArrayList<>();
		List<Canards> listeCanards = new ArrayList<>();
		List<Paons> listePaons = new ArrayList<>();
		List<Poulets> listePoulets = new ArrayList<>();

		Scanner sn = new Scanner(System.in);

		Poulets pl = new Poulets(2);
		Canards cn = new Canards(1);
		Paons pn = new Paons(1);

		boolean continueProgramme = true;
		double salaire = 0;
		int choixSeliction;

		while (continueProgramme) {
			System.out.println("=========================== Accueil ===============================");
			System.out.println("1 - ajouter une volaille.");
			System.out.println("2 - modifier poids abattage.");
			System.out.println("3 - modifier prix du jour.");
			System.out.println("4 - modifier poids d'une volaille.");
			System.out.println("5 - voir le nombre de volailles par type.");
			System.out.println("6 - voir le total de prix des volailles abattables.");
			System.out.println("7 - vendre une volaille.");
			System.out.println("8 - rendre un paon au parc.");
			System.out.println("9 - Affichier tout les volaille");
			System.out.println("=====================================================================");			
			choixSeliction=sn.nextInt();
			sn.nextLine();

			switch (choixSeliction) {
			case 1:
				System.out.println("==================== Ajouter une volaill ========================");
				System.out.println("1 - ajoute une poulet :");
				System.out.println("2 - ajouter un canard :");
				System.out.println("3 - ajouter un paon :");
				choixSeliction=sn.nextInt();sn.nextLine();
				System.out.println("=====================================================================");

				switch (choixSeliction) {
				case 1:
					System.out.println("=====================================================================");
					System.out.println("Ajoute le poid de la poulet :");
					double poidDePoulet=sn.nextDouble();
					sn.nextLine();
					pl.ajouterPoulet(poidDePoulet,listePoulets,listVolailles);
					break;

				case 2:
					System.out.println("=====================================================================");
					System.out.println("Ajoute le poid d'un canard :");
					double poidDecanard=sn.nextDouble();
					sn.nextLine();
					cn.ajouterCanard(poidDecanard,listeCanards,listVolailles);
					break;

				case 3:
					System.out.println("=====================================================================");
					System.out.println("Ajoute un paon :");
					double poidDePaon=sn.nextDouble();
					sn.nextLine();
					pn.ajouterPaons(poidDePaon,listePaons,listVolailles);
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.println("==================== Modifier le poid d'abattage ========================");
				System.out.println("1 - Modifier le poid d'abattage pour poulet :");
				System.out.println("2 - Modifier le poid d'abattage pour canard :");
				choixSeliction=sn.nextInt();sn.nextLine();
				System.out.println("=====================================================================");

				switch (choixSeliction) {
				case 1:
					System.out.println("=====================================================================");
					System.out.println("Modifier le poid d'abattage de la poulet :");
					double poidAbattageP = sn.nextDouble();sn.nextLine();
					for (Poulets poulets : listePoulets) {
						poulets.setPoidAbattage(poidAbattageP);		
					}System.out.println("le poid d'abattage et bien modifier");

					break;

				case 2:
					System.out.println("=====================================================================");
					System.out.println("Modifier le poid d'abattage d'un canard :");
					double poidAbattageC = sn.nextDouble();sn.nextLine();
					//					for (Canards canards : listeCanards) {
					//						canards.setPoidAbattage(poidAbattageC);
					//					}System.out.println("le poid d'abattage et bien modifier");
					cn.modifiePoidAabattage(poidAbattageC,listeCanards);
					break;
				default:
					break;
				}
				break;
			case 3:
				System.out.println("==================== Modifier le prix du jour ========================");
				System.out.println("1 - Modifier le prix du jour pour poulet");
				System.out.println("2 - Modifier le prix du jour pour canard");
				choixSeliction=sn.nextInt();sn.nextLine();
				System.out.println("=====================================================================");

				switch (choixSeliction) {
				case 1:
					System.out.println("=====================================================================");
					System.out.println("Modifier le prix du jour pour les poulets ");
					double newPrixP = sn.nextDouble();sn.nextLine();
					for (Poulets pt : listePoulets) {
						pt.setPrixdujour(newPrixP);
					}System.out.println("Changement et bien Effectue");
					break;

				case 2:
					System.out.println("=====================================================================");
					System.out.println("Modifier le prix du jour pour les canards");
					double newPrixC = sn.nextDouble();sn.nextLine();
					for (Canards cnd : listeCanards) {
						cnd.setPrixdujour(newPrixC);
					}System.out.println("Changement et bien Effectue");
					break;
				default:
					break;
				}
				break;
			case 4:
				System.out.println("==================== Modifier le poid d'un volaille ========================");
				System.out.println("1 - Modifier le poid d'une poulet");
				System.out.println("2 - Modifier le poid d'un canard");
				choixSeliction=sn.nextInt();sn.nextLine();

				System.out.println("=====================================================================");

				switch (choixSeliction) {
				case 1:
					System.out.println("=====================================================================");
					System.out.println(listePoulets);
					System.out.println("Saisir l'ID du Poulet a modifier :");
					System.out.println("Modifier le poid d'une poulet ");
					int IDp = sn.nextInt();sn.nextLine();
					System.out.println("saisir  le nouveau poids");
					double modfPoidP= sn.nextDouble();sn.nextLine();
					for (Poulets poulets : listePoulets) {
						if (poulets.getNumIdent() == IDp) {

							poulets.setPoids(modfPoidP);
							System.out.println("Modification est bien effectue .");
						}else {
							System.out.println("ID est introuvable");
						}
					}
					break;

				case 2:
					System.out.println("=====================================================================");
					System.out.println(listeCanards);
					System.out.println("Modifier le poid d'un canard");
					System.out.println("Saisir l'ID du Canard a modifier :");
					int id = sn.nextInt();sn.nextLine();
					System.out.println("saisir  le nouveau poids");
					double modfPoidC= sn.nextDouble();sn.nextLine();
					for (Canards canard : listeCanards) {
						if (canard.getNumIdent() == id) {

							canard.setPoids(modfPoidC);
							System.out.println("Modification est bien effectue .");
							break;
						}
					}
				default:
					break;
				}
				break;
			case 5:
				System.out.println("==================== Afficher le nombre de volailles par type ========================");
				System.out.println("1 - le nombre des poulets : "+listePoulets.size());
				System.out.println("2 - le nombre des canards : "+listeCanards.size());
				System.out.println("3 - le nombre des poans : "+listePaons.size());		
				System.out.println("=====================================================================");
				break;

			case 6:
				System.out.println("==================== Afficher le total de prix des volailles abattables ========================");
				double res = 0;
				double res1 = 0;
				for (Canards c : listeCanards) {
					res1 = res1 + (c.getPoids() * c.getPrixdujour());

				}
				for (Poulets p : listePoulets) {
					res = res + (p.getPoids() * p.getPrixdujour());

				}
				res = res + res1;
				System.out.println("le prix total est de : " + res + " pour " + listeCanards.size() + " Canard(s)  et "
						+ listePoulets.size() + " Poulet(s)");

				break;

			case 7:
				System.out.println("==================== Vendre une volaille ========================");
				System.out.println("1 - Vendre une poulet :");
				System.out.println("2 - Vendre un canard :");
				choixSeliction=sn.nextInt();sn.nextLine();
				System.out.println("=====================================================================");
				switch (choixSeliction) {
				case 1:
					System.out.println("==================== Vendre une poulet ========================");
					System.out.println(listePoulets);
					System.out.println("Saisir l'ID Recherche");
					int id = sn.nextInt();sn.nextLine();
					for (Poulets p : listePoulets) {

						if (p.getNumIdent() == id) {
							if (p.getPoids() > p.getPoidsmax()) {

								salaire = salaire + p.getPoids() * p.getPrixdujour();
								listVolailles.remove(p);
								listePoulets.remove(p);
								System.out.println("Vente Effectuee votre porte monaie est de "+salaire+ " Euro");
								break;
							}
						}
					}
					break;
				case 2:
					System.out.println("==================== Vendre une Canard ========================");
					System.out.println(listeCanards);
					System.out.println("Saisir l'ID Recherche");
					int id1 = sn.nextInt();sn.nextLine();
					for (Canards p : listeCanards) {

						if (p.getNumIdent() == id1) {
							if (p.getPoids() > p.getPoidsmax()) {

								salaire = salaire + p.getPoids() * p.getPrixdujour();
								listVolailles.remove(p);
								listeCanards.remove(p);
								System.out.println("Vente Effectuee votre porte monaie est de "+salaire+ " Euro");
								break;
							}
						}
					}
					break;

				default:
					break;
				}
				break;

			case 8:
				System.out.println("==================== Rendre un paon au parc ========================");
				System.out.println(listePaons);
				System.out.println("Saisir l ID du paon");
				int id1 = sn.nextInt();sn.nextLine();
				for (Paons paons : listePaons) {
					if (paons.getNumIdent() == id1) {
						listePaons.remove(paons);
						listVolailles.remove(paons);
						salaire = salaire + 200;
						System.out.println("Vente effectuee");
						break;
					}
				}
				System.out.println("votre porte monaie est de " + salaire + " Euro ");

				break;


			case 9 :
				System.out.println("==================== Affichier tout les volaille ========================");
				System.out.println("1 - Affichier une volaille :");
				System.out.println("2 - Affichier une poulet :");
				System.out.println("3 - Affichier un canard :");
				System.out.println("4 - Affichier un paon :");
				choixSeliction=sn.nextInt();sn.nextLine();
				System.out.println("=====================================================================");

				switch (choixSeliction) {
				case 1:
					System.out.println("Afficher toute les volailles");
					for (Volaille volailles : listVolailles) {
						System.out.println(volailles);
					}

					break;

				case 2:
					System.out.println("Afficher toute les poulets");
					for (Poulets poulets : listePoulets) {
						System.out.println(poulets);
					}
					break;

				case 3:
					System.out.println("Afficher toute les Canards");
					for (Canards canards : listeCanards) {
						System.out.println(canards);
					}
					break;

				case 4:
					System.out.println("Afficher toute les Paons");
					for (Paons paons : listePaons) {
						System.out.println(paons);
					}
					break;

				default:
					break;
				}
				break;
			}
		}
	}
}