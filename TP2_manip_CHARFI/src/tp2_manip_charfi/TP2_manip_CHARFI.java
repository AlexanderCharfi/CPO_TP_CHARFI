// CHARFI Alexander 04/11/2025 Manipuation objet
package tp2_manip_charfi;

/**
 *
 * @author Alexander
 */
public class TP2_manip_CHARFI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;            //2 tartiflettes ont été crées et la 3e est en fait la 2e
        //Moussaka assiette666 = assiette1;               Faux : on essaie d’affecter un objet de type Tartiflette à une variable de type Moussaka 
        // Moussaka assiette667 = new Tartiflette();      Faux : on crée un objet Tartiflette et on veut le stocker dans une variable Moussaka. 

        assiette2 = assiette1;
        assiette1 = assiette3;

        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
        // Non une référence objet qui annonce référencer un type d’objet ne peut pas en référencer un autre qui n’a aucun rapport (Comme vu aux lignes 18 et 19)
        
       Moussaka Moussaka1 = new Moussaka(100);
       Moussaka Moussaka2 = new Moussaka(200);
       Moussaka Moussaka3 = new Moussaka(300);
       Moussaka Moussaka4 = new Moussaka(400);
       Moussaka Moussaka5 = new Moussaka(500);
       Moussaka Moussaka6 = new Moussaka(600);
       Moussaka Moussaka7 = new Moussaka(700);
       Moussaka Moussaka8 = new Moussaka(800);
       Moussaka Moussaka9 = new Moussaka(900);
       Moussaka Moussaka10 = new Moussaka(1000);
       
       Moussaka[] tableau = new Moussaka[10];
       tableau[1] = Moussaka1;
       tableau[2] = Moussaka2;
       tableau[3] = Moussaka3;
       tableau[4] = Moussaka4;
       tableau[5] = Moussaka5;
       tableau[6] = Moussaka6;
       tableau[7] = Moussaka7;
       tableau[8] = Moussaka8;
       tableau[9] = Moussaka9;
       tableau[10] = Moussaka10;
        
       
      //Oui un attribut d’un objet peut être une référence vers un autre objet.Cela permet donc de modéliser les relations entre deux objets 

    }

}
