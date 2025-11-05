/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_charfi;

/**
 *
 * @author Alexander
 */
public class Personne {

    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;
    public Personne(String nom, String prenom, int nbVoiture, Voiture[] liste_voitures) {
        this.nom = nom;
        this.prenom = prenom;
        nbVoiture = 0;
        this.liste_voitures = new Voiture[3];
    }
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire != null) {
            return false;
        }
        if (this.nbVoitures >= 3) {
            return false;
        }
        this.liste_voitures[this.nbVoitures] = voiture_a_ajouter;
        this.nbVoitures++;
        voiture_a_ajouter.Proprietaire = this;
        return true;
    }
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " " + prenom + " qui possède " + nbVoitures + " voitures";
        return chaine_a_retourner;
    }

}
