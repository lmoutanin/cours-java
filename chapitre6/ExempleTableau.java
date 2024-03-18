package chapitre6;
import java.util.Scanner;
public class ExempleTableau {

	public static void main(String[] args) {
	
		Scanner monScanner= new Scanner(System.in);
		int[] tableauEntiers;
		tableauEntiers =new int [5];
		
		for (int i=0; i<tableauEntiers.length;i ++) {
		System.out.print("Entrez le nombre "+(i+1)+":");
		String saisie =monScanner.nextLine();
		int nombreSaisi= Integer.parseInt(saisie);
		tableauEntiers[i]=nombreSaisi;
		}
		int somme=0;
		for (int i =0;i<tableauEntiers.length;i++) {
			System.out.println ("Le nombre "+(i+1)+" est "+tableauEntiers[i]);
			somme=somme+tableauEntiers[i];
			
		}
			
System.out.println("Leur somme vaut "+somme);
monScanner.close();
	}

}
