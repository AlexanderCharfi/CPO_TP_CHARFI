// CHARFI Alexander 24/10/2025 Guess my number
package tp1_guessmynumber_charfi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class TP1_guessMyNumber_CHARFI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val;
        boolean bon = false;
        int i = 0;
        int niv;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Quels mode de difficultes ?");
        System.out.println("1) Facile : Tentatives illimités avec indices");
        System.out.println("2) Moyen : 10 tentatives avec indices");
        System.out.println("3) Difficile : 5 tentatives sans indices");
        niv = sc.nextInt();

        if (niv < 1 || niv > 3) {
            System.out.println("Il faut choisir une difficulté");
        } else {

            if (niv == 1) {
                Random generateurAleat = new Random();
                int n = generateurAleat.nextInt(100);
                System.out.println(n);  //pour tester si le programme fonctionne bien
                System.out.println("Bonjour, saisissez une valeur entre 0 et 100");
                while (!bon) {
                    i = i + 1;
                    val = sc.nextInt();

                    if (val < 0 || val > 100) {
                        System.out.println("Erreur valeur non comprise entre 0 et 100");
                        bon = false;
                    } else {
                        System.out.println("Vous avez choisi la valeur : " + val);
                        if (n < val) {
                            System.out.println("La valeur aleatoire est plus petite que votre valeur " + val);
                            bon = false;
                        }
                        if (n > val) {
                            System.out.println("La valeur aleatoire est plus grande que votre valeur " + val);
                            bon = false;
                        }
                        if (n == val) {
                            System.out.println("La valeur aleatoire " + n + " est egale a votre valeur " + val);
                            System.out.println("Vous avez fait " + i + " tentatives");
                            bon = true;
                        }
                    }
                }

            }
            if (niv == 2) {
                Random generateurAleat = new Random();
                int n = generateurAleat.nextInt(100);
                System.out.println(n);
                System.out.println("Bonjour, saisissez une valeur entre 0 et 100");
                System.out.println("Vous avez 10 tentatives");
                while (!bon) {
                    i = i + 1;
                    System.out.println("Tentative numero : " +i) ;
                    val = sc.nextInt();
                    if (i > 10) {
                        System.out.println("PARTIE PERDUE");
                        break;
                    }
                    else {
                    if (val < 0 || val > 100) {
                        System.out.println("Erreur valeur non comprise entre 0 et 100");
                        bon = false;
                    } else {
                        System.out.println("Vous avez choisi la valeur : " + val);
                        if (n < val) {
                            System.out.println("La valeur aleatoire est plus petite que votre valeur " + val);
                            bon = false;
                        }
                        if (n > val) {
                            System.out.println("La valeur aleatoire est plus grande que votre valeur " + val);
                            bon = false;
                        }
                        if (n == val) {
                            System.out.println("La valeur aleatoire " + n + " est egale a votre valeur " + val);
                            System.out.println("Vous avez fait " + i + " tentatives");
                            bon = true;
                        }
                    }
                }
                }

            }
            if (niv == 3) {
                Random generateurAleat = new Random();
                int n = generateurAleat.nextInt(100);
                System.out.println(n);
                System.out.println("Bonjour, saisissez une valeur entre 0 et 100");
                while (!bon) {
                    i = i + 1;
                    System.out.println("Tentative numero : " +i) ;
                    val = sc.nextInt();
                    if (i > 5) {
                        System.out.println("PARTIE PERDUE");
                        break;
                    }
                    if (val < 0 || val > 100) {
                        System.out.println("Erreur valeur non comprise entre 0 et 100");
                        bon = false;
                    } else {
                        System.out.println("Vous avez choisi la valeur : " + val);
                        if (n < val) {
                            System.out.println("Votre valeur : " + val + "n'est pas bonne");
                            bon = false;
                        }
                        if (n > val) {
                            System.out.println("Votre valeur : " + val + "n'est pas bonne");
                            bon = false;
                        }
                        if (n == val) {
                            System.out.println("La valeur aleatoire " + n + " est egale a votre valeur " + val);
                            System.out.println("Vous avez fait " + i + " tentatives");
                            bon = true;
                        }
                    }
                }
                }
            }
        }
    }
