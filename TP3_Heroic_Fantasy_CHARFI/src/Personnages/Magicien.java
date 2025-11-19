/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author Alexander
 */
public class Magicien extends Personnage {
    
    boolean confirme;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
    }

    public void setACheval(boolean aCheval) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return super.toString() + ", Confirmé: " + confirme;
    }
    
}
