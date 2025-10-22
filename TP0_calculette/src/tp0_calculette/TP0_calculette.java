// CHARFI Alexander 20/10/2025 TP0_calculette
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        int operateur;
        Scanner sc ;
        
        sc = new Scanner (System.in) ;
        System.out.println("Donnez une valeur entiere");
        operateur = sc.nextInt();
        
        System.out.println("Choisissez une premiere valeur");
        double operande1;
        operande1 = sc.nextDouble();
        
        System.out.println("Choisissez une deuxieme valeur");
        double operande2;
        operande2= sc.nextDouble();
        
        double resultat;
        if (operateur==1) {
            resultat = operande1 + operande2;
            System.out.println("Le résultat est " + resultat);
        }
        else if (operateur==2) {
            resultat = operande1 - operande2;
            System.out.println("Le résultat est " + resultat);
        }
        else if (operateur==3) {
            resultat = operande1 * operande2;
            System.out.println("Le résultat est " + resultat);
        }
        else if (operateur==4) {
            if (operande2==0) {
                System.out.println("Erreur division par 0 impossible");
            }
            else {
                resultat = operande1 / operande2;
                System.out.println("Le résultat est " + resultat);
            }
        }
        else if (operateur==5) {
            resultat = operande1 % operande2;
            System.out.println("Le résultat est " + resultat);
        }
        else {
            System.out.println("Erreur choisissez un nombre entre 1 et 5");
        }
    }
    
}
