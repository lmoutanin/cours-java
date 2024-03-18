package chapitre6;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {

		double somme = 0;
		Scanner monScanner = new Scanner(System.in);
		double[] tableauDouble;
		tableauDouble = new double[5];

		for (int i = 0; i < tableauDouble.length; i++) {
			System.out.println("Entrez le nombre " + (i + 1) + ":");
			String saisie = monScanner.nextLine();
			double nombreSaisi = Double.parseDouble(saisie);
			tableauDouble[i] = nombreSaisi;
			

			somme = somme + tableauDouble[i];
		}

		System.out.println("Leur somme vaut " + somme);

		monScanner.close();

	}
}