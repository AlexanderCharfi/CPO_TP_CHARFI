/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alexander
 */
public class CadenasGame {
    public static final int COMBO_LENGTH = 4;
    public static final int MIN_DIGIT = 0;
    public static final int MAX_DIGIT = 9;   
    private final int[] combinaisonSecrete = new int[4];
    public CadenasGame() {
        genererCombinaison();
    }
    private void genererCombinaison() {
        for (int i = 0; i < 4; i++) {
            combinaisonSecrete[i] = (int) (Math.random() * 10); // 0..9
        }
    }
    Resultat testerCombinaison(int[] proposition) {
        int exact = 0, tropHaut = 0, tropBas = 0;
            for (int i = 0; i < 4; i++) {
                if (proposition[i] == combinaisonSecrete[i]) {
                    exact++;
                } 
                else if (proposition[i] > combinaisonSecrete[i]) {
                    tropHaut++;
                } 
                else {
                    tropBas++;
                }
            }
            return new Resultat(exact, tropHaut, tropBas);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class Resultat {
        public final int exact;
        public final int tropHaut;
        public final int tropBas;
        public Resultat(int exact, int tropHaut, int tropBas) {
            this.exact = exact;
            this.tropHaut = tropHaut;
            this.tropBas = tropBas;
        }
    }
}
