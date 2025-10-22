// CHARFI Alexander 22/10/2025 Saisie et manipulation de nombres
package tp1__manipnombresint_charfi;

import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class TP1__manipNombresInt_CHARFI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Entrez deux entiers");
        int entier1;
        int entier2;
        Scanner sc ;
        
        sc = new Scanner (System.in) ;
        System.out.println("Entrez le premier entier");
        entier1 = sc.nextInt();
        System.out.println("Entrez le premier entier");
        entier2 = sc.nextInt();
        
        double somme;
        double difference;
        double produit;
        somme = entier1 + entier2;
        difference = entier1 - entier2;
        produit = entier1 * entier2;
        System.out.println("La somme des deux entiers : " + somme);
        System.out.println("La difference des deux entiers : " + difference);
        System.out.println("Le produit des deux entiers : " + produit);
        
        double quotient;
        double reste;
        quotient = entier1 / entier2;
        reste = entier1 % entier2;
        System.out.println("Le quotient de l'entier 1 et 2 : " + quotient);
        System.out.println("Le reste de la divisions euclidienne de l'entier 1 et 2 : " + reste);
        
    }
    
}
