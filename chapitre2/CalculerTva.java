package chapitre2;

public class CalculerTva {

	public static void main(String[] args) {
		
		//Definition du montant ht
		
		double montantHt = 100;
		
		//Definition du taux de tva à 20%
		
		double tauxTva=0.20;
		
		//calcul du montant de la TVA
		double montantTva= montantHt*tauxTva;
		
		//calcul du montant T.T.C
		
		double montantTtc  = montantHt + montantTva;
		
		 
		
		
		System.out.println("Montant ht :"+montantHt+" $  "+"Montant TVA :"+montantTva+" $  "+"Le Taux TVA :"+tauxTva+" % "+" le montant total est de :"+montantTtc+" $");
		
		
		
		
		

	}

}
