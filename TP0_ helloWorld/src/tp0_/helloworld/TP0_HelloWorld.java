// CHARFI Alexander 20/10/2025 Affichage d'un message
package tp0_.helloworld;

import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class TP0_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prenom ; 
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine();
        System.out.println( "Bonjour " + prenom ) ;
        System.out.println( "Au revoir" ) ;
        int i = 20;
    }
    
}