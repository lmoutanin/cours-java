package chapitre9;

public class MonMain {

    public static void main(String[] args) {
        Voiture maVoiture = new Voiture(2023, "rouge", "bmw", "neuf", 9900,"fr10kkdjdnhj");
        
        
        maVoiture.accelerer(110);
        System.out.println(maVoiture);

         
        
        maVoiture.freiner(20);
        System.out.println(maVoiture);

        System.out.println("La couleur de la voiture est " + maVoiture.getCouleur());

    }
}
