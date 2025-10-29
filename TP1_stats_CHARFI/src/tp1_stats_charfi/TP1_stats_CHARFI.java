// CHARFI Alexander 29/10/2025 Statistique
package tp1_stats_charfi;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Alexander
 */
public class TP1_stats_CHARFI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tableau = new int[6];
        int m;
        double pourcentage;

        tableau[0] = 0;
        tableau[1] = 0;
        tableau[2] = 0;
        tableau[3] = 0;
        tableau[4] = 0;
        tableau[5] = 0;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Choisissez un nommbre entier");
        m = sc.nextInt();

        System.out.println("Vous avez choisi : " + m);

        for (int i = 0; i < m; i++) {

            int tirage = (int) (Math.random() * 6); // nombre aléatoire entre 0 et 5
            tableau[tirage]++; // incrémentation de la case correspondante
        }
        for (int i = 0; i < tableau.length; i++) {
            pourcentage = (tableau[i] / (double) m) * 100;
            System.out.println("Face " + (i+1) + " : " + tableau[i] + " tirages ("+ pourcentage + " %)");
        }
    }
}
