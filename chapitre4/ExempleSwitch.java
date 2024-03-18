package chapitre4;

import java.util.Scanner;

public class ExempleSwitch {

	public static void main(String[] args) {
		
		Scanner monScanner = new Scanner(System.in);
		System.out.println("Pleut-il ? (1 : peu , 2 :beaucoup , 3 : énormément");
		String pluie =monScanner.nextLine();
		switch (pluie) {
		case "1":
		   System.out.println("Prenez un parapluie");
		   break;
		case "2":
	       System.out.println("Prenez une veste");
	       break;
		case"3":
		System.out.println("restez à la maison !");
		break;
		
		default:
			System.out.println("choix incorrect");
			break;
		
		
		}
		
		
		
		
		
		
	}

}
