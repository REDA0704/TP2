package TP2;

public class Bus extends Vehicule {

    private int nbPassagers;

    public Bus(String marque, String modele, int vitesseMax, int nbPassagers) {
        super(marque, modele, vitesseMax);
        this.nbPassagers = nbPassagers;
    }

    @Override
    public void demarrer() {
        System.out.println("Le bus démarre en fermant les portes.");
    }

    @Override
    public void rouler() {
        System.out.println("Le bus roule avec " + nbPassagers + " passagers.");
    }

    public void prendrePassagers(int n) {
        nbPassagers += n;
        System.out.println(n + " passagers montent. Total : " + nbPassagers);
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Passagers : " + nbPassagers);
    }
}
