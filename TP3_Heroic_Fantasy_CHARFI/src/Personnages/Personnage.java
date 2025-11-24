/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Alexander
 */
public class Personnage {

    String nom;
    int niveauVie;
    Arme ArmeEnMain;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.InventaireArme = InventaireArme;
        this.ArmeEnMain = null;
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

}
