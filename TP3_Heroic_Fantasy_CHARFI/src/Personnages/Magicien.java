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
public class Magicien extends Personnage {

    boolean confirme;
    static int nbMagiciens = 0;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        nbMagiciens++;
    }

    public void setACheval(boolean aCheval) {
        this.confirme = confirme;
    }

    public int compterArmesPreferées() {
        int count = 0;
        for (Arme arme : InventaireArme) {
            if (arme instanceof Baton) {
                count++;
            }
        }
        return count;
    }

    public static int getNbMagiciens() {
        return nbMagiciens;
    }

    @Override
    public void attaquer(Personnage cible) {
        cible.estAttaque(20); // Magicien inflige 20 points
    }

    @Override
    public void detruire() {
        nbMagiciens--;
        nbPersonnages--;
        System.out.println("Magicien détruit : " + this.getNom());
    }

    @Override
    public String toString() {
        return super.toString() + ", Confirmé: " + confirme;
    }

    boolean isConfirme() {
        return confirme;
    }
}
