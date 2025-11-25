/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
import tp3_heroic_fantasy_charfi.etreVivant;

/**
 *
 * @author Alexander
 */
public abstract class Personnage implements etreVivant {

    String nom;
    int niveauVie;
    Arme ArmeEnMain;
    static int nbPersonnages = 0;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.InventaireArme = InventaireArme;
        this.ArmeEnMain = null;
        nbPersonnages++;
    }

    public int DonnerNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }

    ArrayList<Arme> InventaireArme = new ArrayList<Arme>();

    public void ajouterArme(Arme arme) {
        if (InventaireArme.size() < 5) { // Vérifie qu'il y a moins de 5 armes
            InventaireArme.add(arme);    // Ajoute l'arme dans l'ArrayList
            System.out.println("Arme ajoutée : " + arme.getNom());
        } else {
            System.out.println("Inventaire plein ! Impossible d'ajouter " + arme.getNom());
        }
    }

    public Arme getArmeEnMain() {
        return ArmeEnMain;
    }

    public void equiperArme(String nomArme) {
        for (Arme a : InventaireArme) {
            if (a.getNom().equalsIgnoreCase(nomArme)) {
                ArmeEnMain = a;
                System.out.println("Arme " + nomArme + " équipée avec succès !");
                return;
            }
        }
        System.out.println("Arme " + nomArme + " introuvable dans l'inventaire.");
    }

    public static int getNbPersonnages() {
        return nbPersonnages;
    }

    public void detruire() {
        nbPersonnages--;
        System.out.println("Personnage détruit : " + this.getNom());
    }

    public void attaquer(Personnage cible) {
        if (ArmeEnMain == null) {
            System.out.println(getNom() + " n'a pas d'arme !");
            return;
        }

        int degats = ArmeEnMain.getNiveauAttaque();

        // Cas Magicien avec Bâton
        if (this instanceof Magicien && ArmeEnMain instanceof Baton) {
            degats *= ((Baton) ArmeEnMain).getAge();
        }

        // Cas Guerrier avec Épée
        if (this instanceof Guerrier && ArmeEnMain instanceof Epee) {
            degats *= ((Epee) ArmeEnMain).getFinesse();
        }

        // Réduction si confirmé ou à cheval
        if ((this instanceof Magicien && ((Magicien) this).isConfirme())
                || (this instanceof Guerrier && ((Guerrier) this).isACheval())) {
            degats /= 2;
        }

        // Fatigue après attaque
        this.seFatiguer();

        // Appliquer les dégâts
        cible.estAttaque(degats);

        // Message
        System.out.println(getNom() + " attaque " + cible.getNom() + " et inflige " + degats + " points !");
    }

    @Override
    public String toString() {

        String info = "Nom: " + nom + ", Niveau de vie: " + niveauVie;
        if (ArmeEnMain != null) {
            info += ", Arme en main: " + ArmeEnMain.toString();
        } else {
            info += ", Arme en main: aucune";
        }
        return info;

    }

    @Override
    public void seFatiguer() {
        this.niveauVie -= 10; // La fatigue fait perdre 10 points
        if (this.niveauVie < 0) {
            this.niveauVie = 0; // Pour éviter un niveau de vie négatif
        }

    }

    @Override
    public boolean estVivant() {
        return this.niveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        this.niveauVie -= points; // Réduit le niveau de vie
        if (this.niveauVie < 0) {
            this.niveauVie = 0; // Pour éviter un niveau de vie négatif
        }
    }
}
