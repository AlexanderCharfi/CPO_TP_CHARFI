/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_charfi;

/**
 *
 * @author Alexander
 */
public class Convertisseur {
    int nbConversions ;
    
    public Convertisseur() {
        nbConversions = 0 ;
    }
    public double CelciusVersKelvin (double tCelcius ) {
        nbConversions = nbConversions + 1;
        tCelcius = tCelcius + 273.15;
        return tCelcius;
    }
    public double KelvinVersCelcius (double tKelvin) {
        nbConversions = nbConversions + 1;
        tKelvin = tKelvin - 273.15;
        return tKelvin;
    }
    public double FarenheitVersCelcius (double tFarenheit) {
        nbConversions = nbConversions + 1;
        tFarenheit = (((tFarenheit -32 )*5)/9);
        return tFarenheit;
    }
    public double CelciusVersFarenheit (double tCelcius) {
        nbConversions = nbConversions + 1;
        tCelcius = ((tCelcius*9)/5) + 32;
        return tCelcius;
    }
    public double KelvinVersFarenheit (double tKelvin) {
        nbConversions = nbConversions + 1;
        tKelvin = (((((tKelvin - 273.15)*9))/5) + 32 );
        return tKelvin;
    }
    public double FarenheitVersKelvin (double tFarenheit) {
        tFarenheit = FarenheitVersCelcius (tFarenheit) ;
        tFarenheit = CelciusVersKelvin (tFarenheit) ;
        return tFarenheit;
    }
    
    @Override
   public String toString(){
       return "nb de conversions"+ nbConversions;
   }
}
