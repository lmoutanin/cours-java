package chapitre10;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
	class MaFenetre extends JFrame  implements MouseListener{
		public MaFenetre() { //constructeur
		setTitle ("Ma premiere fenêtre") ;
		setSize (300, 150) ;
		addMouseListener(this);
		
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			 
			 
			int x = e.getX() ;
			int y = e.getY() ;
			System.out.println ("clic au point de coordonnees " + x + ", " + y ) ;
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		  
}
	 