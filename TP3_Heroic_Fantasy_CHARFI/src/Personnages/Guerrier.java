/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;
import Armes.Arme;
import Armes.Epee;
import Armes.Baton;

/**
 *
 * @author Alexander
 */
public class Guerrier extends Personnage {

    boolean aCheval;
    static int nbGuerriers = 0;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        nbGuerriers++;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    public int compterArmesPreferées() {
        int count = 0;
        for (Arme arme : InventaireArme) {
            if (arme instanceof Epee) {
                count++;
            }
        }
        return count;
    }

    public static int getNbGuerriers() {
        return nbGuerriers;
    }

    @Override
    public void attaquer(Personnage cible) {
        cible.estAttaque(30); // Guerrier inflige 30 points
    }

    @Override
    public void detruire() {
        nbGuerriers--;
        nbPersonnages--;
        System.out.println("Guerrier détruit : " + this.getNom());
    }

    @Override
    public String toString() {
        return super.toString() + ", À cheval: " + aCheval;
    }

    boolean isACheval() {
        return aCheval;
    }
}
