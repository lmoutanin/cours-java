package chapitre7;

import java.util.Scanner;

public class AfficherEntier {

	public static void main(String[] args) {
	 int nombreSaisi =saisirEntier();
	 System.out.println("Le nombre saisi est "+nombreSaisi);

	}
	public static int saisirEntier() {
	System.out.println("Entrez un nombre entier :");
	Scanner monscanner = new Scanner (System.in);
	String saisie = monscanner.nextLine();
	int nombre = Integer.parseInt(saisie);
	monscanner.close();
	return nombre;
			
	
	}
}
