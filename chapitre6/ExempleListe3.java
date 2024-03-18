package chapitre6;

import java.util.ArrayList;
import java.util.List;

public class ExempleListe3 {

	public static void main(String[] args) {
		
		List<Double>valeurs; //declaration 
		valeurs=new ArrayList<Double>(); //instanciation
		valeurs.add(12.5);
		valeurs.add(10.2);
		valeurs.add(17.5);
		valeurs.add(13.0);
		
		double total =0;
		for (int i=0;i<valeurs.size(); i++) {
			total = total +valeurs.get(i);
		}
		System.out.println(total);
	}

}
