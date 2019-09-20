package programme;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import command.*;
import erreur.ErreurIsPrime;
import erreur.ErreurRiver;

public class Programme {
	public static void main(String[] args) throws MalformedURLException, IOException {
		ErreurRiver errRiver = new ErreurRiver();
		ErreurIsPrime errIsprime = new ErreurIsPrime();
		Commandes commandes = new Commandes();
		Scanner sc = new Scanner(System.in);
		System.out.println("AFPA-CDA Command Line");
		List<String> listParam = new ArrayList<>();
		boolean programme = true;
		while (programme) {
			listParam.clear();
			System.out.print("-->");
			String choix = sc.nextLine();
			String savetempo = Commandes.getChoix(choix).toLowerCase();
			listParam = Commandes.getParam(choix.toLowerCase());
			switch (savetempo) {
			case "cat":
				try {
					Cat.lireFichier(listParam.get(0));
				} catch (FileNotFoundException e) {
					System.out.println("Le fichier spécifié est introuvable");
				}
				break;
			case "crf":
				Crf.crf(listParam.get(0));
				break;
			case "crd":
				Crd.crd(listParam.get(0));
				break;
			case "find":
				/*
				 * 
				 * GETSION AVEC LES PARAMS -ends et - starts + le second param Path
				 * 
				 */
				FindFile.walk(Cd.getStr());
				break;
			case "copy":
				Copy.copy(listParam.get(0), listParam.get(1));
				break;
			case "cd":
				if(listParam.isEmpty()) {
					listParam.add(0, "manquant");
				} 
				System.out.println(Cd.cd(listParam.get(0)));
				break;
			case "help":
				System.out.println(commandes);
				break;
			case "pwd":
				System.out.println(PrintWorkingDirectory.pwd());
				break;
			case "river":
				try {
					River.river(Long.parseLong(listParam.get(0)), Long.parseLong(listParam.get(1)));
					History.addHistoriqueAvecDeuxParam(savetempo, Long.parseLong(listParam.get(0)),
							Long.parseLong(listParam.get(1)));
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Commande incorrect");
					System.out.println(errRiver.toString());
					History.addHistoriqueSansParam(savetempo + " Erreur");
				}
				break;
			case "dir":
				if(listParam.isEmpty()) {
					listParam.add(0, "manquant");
				} 
				Directory.dir(listParam.get(0));
				History.addHistoriqueSansParam(savetempo);
				break;
			case "dirng":
				if(listParam.isEmpty()) {
					listParam.add(0, "manquant");
				} 
				Directory.dirng(listParam.get(0));
				History.addHistoriqueSansParam(savetempo);
				break;
			case "isprime":
				try {
					IsPrime.isPrime(Long.parseLong(listParam.get(0)));
					History.addHistoriqueAvecUnParam(savetempo, (Long.parseLong(listParam.get(0))));	
				}catch (IndexOutOfBoundsException e) {
					System.out.println("Paramètre invalide.");
					System.out.println(errIsprime.toString());
					History.addHistoriqueSansParam(savetempo+" Erreur ");
				}
				break;
			case "history":
				History.history();
				break;
			case "histclear":
				History.historyClear();
				break;
			case "fin":
				programme = Commandes.exit();
				break;
			case "exit":
				programme = Commandes.exit();
				break;
			case "quit":
				programme = Commandes.exit();
				break;
			default:
				Commandes.messageDefault();
				break;
			}
			listParam.clear();
		}
		sc.close();
	}
}