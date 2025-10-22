// CHARFI Alexander 22/10/2025 Saisie et manipulation de nombres
package tp1_convertisseur_charfi;

import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class TP1_convertisseur_CHARFI {
    public static double CelciusVersKelvin (double tCelcius) { 
        tCelcius = tCelcius + 273.15;
        return tCelcius;
    }
    public static double KelvinVersCelcius (double tKelvin) { 
        tKelvin = tKelvin - 273.15;
        return tKelvin;
    }
    public static double FarenheitVersCelcius (double tFarenheit) { 
        tFarenheit = (((tFarenheit -32 )*5)/9);
        return tFarenheit;
    }
    public static double CelciusVersFarenheit (double tCelcius) { 
        tCelcius = ((tCelcius*9)/5) + 32;
        return tCelcius;
    }
    public static double KelvinVersFarenheit (double tKelvin) { 
        tKelvin = (((((tKelvin - 273.15)*9))/5) + 32 );
        return tKelvin;
    }
    public static double FarenheitVersKelvin (double tFarenheit) { 
        tFarenheit = FarenheitVersCelcius (tFarenheit) ;
        tFarenheit = CelciusVersKelvin (tFarenheit) ;
        return tFarenheit;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double val;
        double convertie;
        int choix;
        
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
            convertie = CelciusVersKelvin(val);
            System.out.println(val + " degré Celcius est égal à " + convertie + " degrés Kelvin");
        }
        if (choix==2) {
            convertie = KelvinVersCelcius(val);
            System.out.println(val + " degré Kelvin est égal à " + convertie + " degrés Celcius");
        }
        if (choix==3) {
            convertie = FarenheitVersCelcius(val);
            System.out.println(val + " degré Farenheit est égal à " + convertie + " degrés Celcius");
        }
        if (choix==4) {
            convertie = CelciusVersFarenheit(val);
            System.out.println(val + " degré Celcius est égal à " + convertie + " degrés Fahrenheit");
        }
        if (choix==5) {
            convertie = KelvinVersFarenheit(val);
            System.out.println(val + " degré Kelvin est égal à " + convertie + " degrés Fahrenheit");
        }
        if (choix==6) {
            convertie = FarenheitVersKelvin(val);
            System.out.println(val + " degré Fahrenheit est égal à " + convertie + " degrés Kelvin");
        }   
        else {
            System.out.println("Erreur choissez une convertion valide");
        }
    }    
}
