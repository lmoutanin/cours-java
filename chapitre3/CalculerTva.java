package chapitre3;

import java.util.Scanner;

public class CalculerTva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message = "Bienvenue dans l'application Tva!";
		System.out.println(message);
		
		Scanner monScanner =new Scanner(System.in);
		
		//Saisie et conversion du montant hors taxes
		System.out.println("Entrez un montantHT:");
		String saisie =monScanner.nextLine();
		double montantHt =Double.parseDouble(saisie);
		
		//Definition du taux de TVA à 20%
		double tauxTva=0.20;
		
		//Calcul du montant T.T.C
		double montantTc=montantHt*(1+tauxTva);
		System.out.println("Choisir votre devise");
		String devise= monScanner.nextLine();
		//Affichage du montant converti
		
		String sortie = "Le montant TTC est de "  ;

		sortie+=montantTc +" "+devise;
		System.out.println(sortie);
		
		System.out.println("Merci d'avoir utiliser l'application au revoir");
		monScanner.close();
		
		
	}

}
