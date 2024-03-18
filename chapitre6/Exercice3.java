package chapitre6;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		
		double somme = 0;
		Scanner monScanner = new Scanner(System.in);
		double[] tableauDouble;
		tableauDouble = new double[5];
		int i = 0;

		while (i < tableauDouble.length ) {
			
			System.out.println("Entrez le nombre " + (i ) + ":");
			String saisie = monScanner.nextLine();
			double nombreSaisi = Double.parseDouble(saisie);
			tableauDouble[i] = nombreSaisi;
			
			
			somme = somme + tableauDouble[i];
			i++;
		}

		System.out.println("Leur somme vaut " + somme);

		monScanner.close();

	}

}
