/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author Alexander
 */
public class Epee extends Arme {
    int finesse;
    
    public Epee (String nom, int niveau, int finesse) {
        super(nom, niveau);
        this.nom = nom;
        if (finesse >= 100) {
            this.finesse = 99;
        }
        else if (finesse < 0) {
            this.finesse = 1;
        }
        else {
            this.finesse = finesse;
        }
    }

    @Override
    public String toString() {
        return "Epee{" + "nom=" + nom + ", finesse=" + finesse + '}';
    }
    
    
    
}
