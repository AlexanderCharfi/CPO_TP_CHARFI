/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_charfi;

/**
 *
 * @author Alexander
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire ;

    public Voiture(String Modele, String Marque, int PuissanceCV, String Proprietaire) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        Proprietaire = null;
    }
   
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Une " + Modele + " " + Marque + " avec une puissance de " + PuissanceCV + " appartenant à " + Proprietaire;
        return chaine_a_retourner;
    }
    
    
}
