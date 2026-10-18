public abstract class Vehicule {

    private String marque;
    private String modele;
    protected int vitesseMax;
    static int nbVehicules;
    
    // Constructeur par défaut
    public Vehicule() {
        this.marque = "Inconnu";
        this.modele = "Inconnu";
        this.vitesseMax = 0;
        nbVehicules++;
    }

    // Constructeur paramétré
    public Vehicule(String marque, String modele, int vitesseMax) {
        this.marque = marque;
        this.modele = modele;
        this.vitesseMax = vitesseMax;
        nbVehicules++;
    }

    public void afficherInfos(){
        System.out.println("Marque : " + this.marque);
        System.out.println("Modèle : " + this.modele);
        System.out.println("Vitesse maximale : " + this.vitesseMax);
    }

    public abstract void demarrer();

    public void rouler(){
        System.out.println("Le véhicule roule");
    }

    public static void afficherNbVehicules(){
        System.out.println("Nombre de véhicules créés : " + nbVehicules);
    }
}


