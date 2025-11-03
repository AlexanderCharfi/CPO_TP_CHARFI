// CHARFI Alexander 03/11/2025 Bieres
package tp2_bieres_charfi;

/**
 *
 * @author Alexander
 */
public class TP2_Bieres_CHARFI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0, "Dubuisson");
        uneBiere.ouverte = true;
        //uneBiere.lireEtiquette();
        uneBiere.Décapsuler();
        System.out.println(uneBiere) ;

        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe");
        deuxBiere.ouverte = false;
        //deuxBiere.lireEtiquette();
        deuxBiere.Décapsuler();
        System.out.println(deuxBiere);
        
        BouteilleBiere troisBiere = new BouteilleBiere("Biere 3", (float) 3.0, "Brasserie 3");
        troisBiere.ouverte = true;
        //troisBiere.lireEtiquette();
        troisBiere.Décapsuler();
        System.out.println(troisBiere);

        BouteilleBiere quatreBiere = new BouteilleBiere("Biere 4", (float) 4.0,"Brasserie 4");
        quatreBiere.ouverte = true;
        //quatreBiere.lireEtiquette();
        quatreBiere.Décapsuler();
        System.out.println(quatreBiere);
        
        BouteilleBiere cinqBiere = new BouteilleBiere("Biere 5", (float) 5.0,"Brasserie 5");
        cinqBiere.ouverte = false;
        //cinqBiere.lireEtiquette();
        cinqBiere.Décapsuler();
        System.out.println(cinqBiere);

    }

}
