// CHARFI Alexander 03/11/2025 convertisseur
package tp2_convertisseurobjet_charfi;

import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class TP2_convertisseurObjet_CHARFI {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        double val;
        double convertie;
        int choix;
        Convertisseur monConvertisseur = new Convertisseur();
        
        Scanner sc ;
        
        sc = new Scanner (System.in) ;
        System.out.println("Bonjour, saisissez une valeur :");
        val = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1)De Celcius vers Kelvin");
        System.out.println("2)De Kelvin vers Celcius");
        System.out.println("3)Farenheit vers Celcius");
        System.out.println("4)Celcius vers Farenheit");
        System.out.println("5)Kelvin vers Farenheit");
        System.out.println("6)De Farenheit vers Kelvin");
        choix = sc.nextInt();
       
        if (choix==1) {
            convertie = monConvertisseur.CelciusVersKelvin(val);
            System.out.println(val + " degré Celcius est égal à " + convertie + " degrés Kelvin");
        }
        else if (choix==2) {
            convertie = monConvertisseur.KelvinVersCelcius(val);
            System.out.println(val + " degré Kelvin est égal à " + convertie + " degrés Celcius");
        }
        else if (choix==3) {
            convertie = monConvertisseur.FarenheitVersCelcius(val);
            System.out.println(val + " degré Farenheit est égal à " + convertie + " degrés Celcius");
        }
        else if (choix==4) {
            convertie = monConvertisseur.CelciusVersFarenheit(val);
            System.out.println(val + " degré Celcius est égal à " + convertie + " degrés Fahrenheit");
        }
        else if (choix==5) {
            convertie = monConvertisseur.KelvinVersFarenheit(val);
            System.out.println(val + " degré Kelvin est égal à " + convertie + " degrés Fahrenheit");
        }
        else if (choix==6) {
            convertie = monConvertisseur.FarenheitVersKelvin(val);
            System.out.println(val + " degré Fahrenheit est égal à " + convertie + " degrés Kelvin");
        }   
        else {
            System.out.println("Erreur choissez une convertion valide");
        }
        System.out.println(monConvertisseur);
    }
    
}
