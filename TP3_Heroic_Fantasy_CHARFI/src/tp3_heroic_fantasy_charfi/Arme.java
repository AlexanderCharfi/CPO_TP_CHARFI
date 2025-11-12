/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_charfi;

/**
 *
 * @author Alexander
 */
public abstract class Arme {

    String nom;
    int niveau;

    public Arme(String nom, int niveau) {
        this.nom = nom;
        if (niveau > 100) {
            this.niveau = 100;
        }
        else if (niveau < 0) {
            this.niveau = 1;
        }
        else {
            this.niveau = niveau;
        }
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveau=" + niveau + '}';
    }

}
