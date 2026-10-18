package TP2;

public class Voiture extends Vehicule {
    
    private int nbPortes;

    public Voiture(String marque, String modele, int vitesseMax, int nbPortes) {
        super(marque, modele, vitesseMax);
        this.nbPortes = nbPortes;
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre en tournant la clé.");
    }

    public void klaxonner() {
        System.out.println("Bip Bip !");
    }

    @Override 
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Nombre de portes : " + this.nbPortes);
    }

}
