package chapitre8;

public class Augmentation {

	public static void main(String[] args) {
		 int x =6;
		 	 augmenterDeUn(x);
		 	 System.out.println("Programme principal : x vaut "+x);
		 		

}
	static void augmenterDeUn(int y) {
		y=y+1;
		System.out.println("Sous-programme: y vaut  "+y);
	}
	 
}