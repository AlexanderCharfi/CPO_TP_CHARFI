/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_charfi;

/**
 *
 * @author Alexander
 */
public class TP2_relation_1_CHARFI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Voiture uneClio = new Voiture("Clio", "Renault", 5, null);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5, null);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6, null);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4, null);
        Voiture uneC3 = new Voiture("C3", "Citroen", 5, null);
        Personne bob = new Personne("Bobby", "Sixkiller", 0, null);
        Personne reno = new Personne("Reno", "Raines", 0, null);
        System.out.println("liste des voitures disponibles " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);
        
        bob.liste_voitures[0] = uneClio;
        bob.liste_voitures[1] = une2008;
        bob.nbVoitures = 2;
        uneClio.Proprietaire = bob;
        une2008.Proprietaire = bob;
        
        reno.liste_voitures[0] = uneAutreClio;
        reno.liste_voitures[1] = uneMicra;
        reno.nbVoitures = 2;
        uneAutreClio.Proprietaire = reno;
        uneMicra.Proprietaire = reno;
        
        System.out.println("");
        
        bob.ajouter_voiture(uneC3);
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0]);
        System.out.println("La deuxième voiture de Bob est " + bob.liste_voitures[1]);
        if (bob.nbVoitures == 3) {
            System.out.println("La troisème Voiture de Bob est" + bob.liste_voitures[2]);
        }
        System.out.println("Bob a " + bob.nbVoitures + " voituires");
        
        System.out.println("");
        
        System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[0]);
        System.out.println("La deuxième voiture de Reno est " + reno.liste_voitures[1]);
        System.out.println("Reno a " + reno.nbVoitures + " voituires");

        // jusqu'à question 8 exclu
    }

}
