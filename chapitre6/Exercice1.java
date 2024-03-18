package chapitre6;
import java.util.Scanner;
public class Exercice1 {

	public static void main(String[] args) {
		Scanner monScanner =new Scanner(System.in);
		System.out.println("Entre un nombre ");
		
		String saisie =monScanner.nextLine();
		double nb =Double.parseDouble(saisie);
	 
		System.out.println("Entre un  deuxiéme nombre ");
	
		String saisiea =monScanner.nextLine();
		double nba =Double.parseDouble(saisiea);
		System.out.println("Entre un  troisiéme nombre ");
		String saisieb =monScanner.nextLine();
		double nbz =Double.parseDouble(saisieb);
		System.out.println("Entre un  quatriéme  nombre ");
		String saisiez =monScanner.nextLine();
		double nbv =Double.parseDouble(saisiez);
		System.out.println("Entre un  cinquiéme nombre ");
		String saisiew =monScanner.nextLine();
		double nbt =Double.parseDouble(saisiew);
		
		System.out.println( nb+nba+nbz+nbv+nbt);
		
	}

}
