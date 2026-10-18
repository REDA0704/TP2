package TP2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(new Voiture("Renault", "Clio", 180, 5));
        vehicules.add(new Moto("Yamaha", "MT-07", 210, 689));
        vehicules.add(new Camion("Volvo", "FH16", 110, 20));

        for (Vehicule v : vehicules) {
            v.afficherInfos();
            v.demarrer();
            v.rouler();
            System.out.println("-----");
        }

        for (Vehicule v : vehicules) {
            if (v instanceof Voiture) {
                ((Voiture) v).klaxonner();
            } else if (v instanceof Moto) {
                ((Moto) v).faireWheeling();
            }
        }

        Voiture v2 = new Voiture("Peugeot", "208");
        v2.afficherInfos();

        Vehicule.afficherNbVehicules();

        Bus bus = new Bus("Mercedes", "Citaro", 90, 10);
        bus.demarrer();
        bus.rouler();
        bus.prendrePassagers(15);
        bus.rouler();

        Vehicule.afficherNbVehicules();
    }
}
