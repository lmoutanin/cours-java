package chapitre6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExempleListe2 {

	public static void main(String[] args) {
		
		List<Double>valeurs; //declaration 
		valeurs=new ArrayList<Double>(); //instanciation
		valeurs.add(12.5);
		valeurs.add(10.2);
		valeurs.add(17.5);
		valeurs.add(13.0);
		
		System.out.println("Methode 1 : For-Each");
		
		for (Double valeur: valeurs) {
			System.out.println(valeur);
		}
	}	
		

}
