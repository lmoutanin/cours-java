package chapitre10;

import java.awt.Frame;

import javax.swing.JFrame;


public class PremiereFenetre {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		MaFenetre maFenetre = new MaFenetre() ;
		
		 
		System.out.println(maFenetre.getTitle()); 
		 
		 
		maFenetre.setTitle ("Ma deuxiéme ") ;
		maFenetre.setVisible (true) ;
		 
		 
	}

}
