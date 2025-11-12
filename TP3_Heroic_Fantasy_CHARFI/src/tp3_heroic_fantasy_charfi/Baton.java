/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_charfi;

/**
 *
 * @author Alexander
 */
public class Baton extends Arme {
    String nom;
    int age;
    
    public Baton (String nom, int niveau, int age) {
        super(nom, niveau);
        this.nom = nom;
        if (age >= 100) {
            this.age = 99;
        }
        else if (age < 0) {
            this.age = 1;
        }
        else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Epee{" + "nom=" + nom + ", finesse=" + age + '}';
    }
}
