// CHARFI Alexander 12/11/2025 Heroic Fantasy
package tp3_heroic_fantasy_charfi;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Alexander
 */
public class TP3_Heroic_Fantasy_CHARFI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Epee Excalibur = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal", 4, 7);
        Epee Caliburn = new Epee("Caliburn", 5, 6);
        Baton Chêne = new Baton("Chêne", 4, 5);
        Baton Charme = new Baton("Charme", 5, 6);
        Baton Branche = new Baton("Saule", 2, 3);

        ArrayList<Arme> ListeArmes;
        ListeArmes = new ArrayList<Arme>();
        ListeArmes.add(Excalibur);
        ListeArmes.add(Durandal);
        ListeArmes.add(Caliburn);
        ListeArmes.add(Chêne);
        ListeArmes.add(Charme);
        ListeArmes.add(Branche);

        int taille_arme = ListeArmes.size();
        int i_arme = 0;

        while (i_arme < taille_arme) {
            System.out.println(ListeArmes.get(i_arme));
            i_arme = i_arme + 1;
        }

        Magicien Gandalf = new Magicien("Gandalf", 65, true);
        Magicien Garcimore = new Magicien("Garcimore", 44, false);
        Guerrier Conan = new Guerrier("Conan", 78, false);
        Guerrier Lannister = new Guerrier("Lannister", 45, true);

        ArrayList<Personnage> ListePersonnage;
        ListePersonnage = new ArrayList<Personnage>();
        ListePersonnage.add(Gandalf);
        ListePersonnage.add(Garcimore);
        ListePersonnage.add(Conan);
        ListePersonnage.add(Lannister);

        int taille_perso = ListePersonnage.size();
        int i_perso = 0;

        while (i_perso < taille_perso) {
            System.out.println(ListePersonnage.get(i_perso));
            i_perso = i_perso + 1;
        }

        Conan.ajouterArme(Branche);      // 1 bâton
        Conan.ajouterArme(Excalibur);  // 1ère épée
        Conan.ajouterArme(Durandal);
        Conan.equiperArme("Excalibur");

        Gandalf.ajouterArme(Charme);    // 1er bâton
        Gandalf.ajouterArme(Chêne);     // 2e bâton
        Gandalf.ajouterArme(Caliburn);
        Gandalf.ajouterArme(Charme);

        System.out.println("Armes préférées de Gandalf : " + Gandalf.compterArmesPreferées());

        for (Personnage p : ListePersonnage) {
            System.out.println(p);

        }

        System.out.println("Nombre total de personnages : " + Personnage.getNbPersonnages());
        System.out.println("Nombre de guerriers : " + Guerrier.getNbGuerriers());
        System.out.println("Nombre de magiciens : " + Magicien.getNbMagiciens());

    }

}


//Arrêter au 45 inclu
