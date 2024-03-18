package chapitre9;

public class Voiture {

    // Propriétés de la voiture
    private int vitesse, annee;
    private String couleur, marque, aspect,immatriculation;
    private float prix, kilometrage;
    
    
    /**
     * Constructeur de la classe Voiture
     * 
     * Ce constructeur permet de créer une instance de la classe Voiture 
     * en spécifiant toutes les propriétés de la voiture dès sa création.
     * 
     * @param vitesse la vitesse initiale de la voiture
     * @param annee l'année de fabrication de la voiture
     * @param couleur la couleur de la voiture
     * @param marque la marque de la voiture
     * @param aspect l'aspect extérieur de la voiture
     * @param prix le prix de la voiture
     */
    public Voiture(int annee, String couleur, String marque, String aspect, float prix,String immatriculation) {
        this.annee = annee;
        this.couleur = couleur;
        this.marque = marque;
        this.aspect = aspect;
        this.prix = prix;
        this.vitesse= 0;
        this.kilometrage = 0;
        this.immatriculation=immatriculation;
    }

    public String getimmatriculation() {
    	
    	return immatriculation;
    	
    }
    
    public void setimmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    
    
    /**
     * Retourne la marque de la voiture.
     * 
     * @return la marque de la voiture
     */
    
    
    
    public String getMarque() {
        return marque;
    }

    /**
     * Retourne l'aspect de la voiture.
     * 
     * @return l'aspect de la voiture
     */
    public String getAspect() {
        return aspect;
    }

    /**
     * Définit l'aspect de la voiture.
     * 
     * @param aspect l'aspect de la voiture
     */
    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    /**
     * Retourne le prix de la voiture.
     * 
     * @return le prix de la voiture
     */
    public float getPrix() {
        return prix;
    }

    /**
     * Définit le prix de la voiture.
     * 
     * @param prix le prix de la voiture
     */
    public void setPrix(float prix) {
        this.prix = prix;
    }

    /**
     * Retourne le kilométrage de la voiture.
     * 
     * @return le kilométrage de la voiture
     */
    public float getKilometrage() {
        return kilometrage;
    }

    /**
     * Définit le kilométrage de la voiture.
     * 
     * @param kilometrage le kilométrage de la voiture
     */
    public void setKilometrage(float kilometrage) {
        this.kilometrage = kilometrage;
    }

    /**
     * Retourne l'année de fabrication de la voiture.
     * 
     * @return l'année de fabrication de la voiture
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * Retourne la couleur de la voiture.
     * 
     * @return la couleur de la voiture
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Retourne la vitesse actuelle de la voiture en km/h.
     * 
     * @return la vitesse actuelle de la voiture
     */
    public float getVitesse() {
        return vitesse;
    }

    /**
     * Augmente la vitesse de la voiture.
     * 
     * @param augmentation la vitesse supplémentaire à ajouter
     */
    public void accelerer(int augmentation) {
        vitesse = vitesse + augmentation;
        kilometrage = ++vitesse;
    }

    /**
     * Diminue la vitesse de la voiture.
     * 
     * @param diminution la vitesse à réduire
     */
    public void freiner(int diminution) {
        vitesse = vitesse - diminution;
    }

    /**
     * Retourne une représentation de l'objet sous forme de chaîne de caractères.
     * 
     * @return une chaîne de caractères représentant l'objet
     */
    public String toString() {
        return "La voiture roule actuellement à " + vitesse + " km/h. La marque est  "+marque+" son immatriculation est "+immatriculation+" son année est "+annee;
    }
    
    


}