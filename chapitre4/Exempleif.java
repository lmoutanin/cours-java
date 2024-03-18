package chapitre4;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Exempleif {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner monScanner = new Scanner(System.in);
		System.out.println("Entre un premier nombre");
		String saisie = monScanner.nextLine();
		int nombre1 = Integer.parseInt(saisie);
		System.out.println("Entrez un seconde nombre");
		saisie = monScanner.nextLine();
		int nombre2 = Integer.parseInt(saisie);

		if (nombre1 < nombre2) {
			System.out.println("Le premier nombre est inférieur au seconde");
		} else {
			if (nombre1 > nombre2) {
				System.out.println("Le premier nombre est supérieur au second");

			} else if (nombre1==nombre2) {
				System.out.println("Les deux nombres sont égaux");
			}
	}

	
	
		

if (( nombre1 >=1 ) && (nombre1 <=20)) {
	System.out.println("Le nombre 1 est compris entre 10 et 20");
}
}
}
