
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa metodiasi täällä
        int rivit = 2;
        int sarakkeet = 3;
        int[][] matriisi = new int[rivit][sarakkeet];
        matriisi[0][1] = 5;
        matriisi[1][0] = 3;
        matriisi[1][2] = 7;
        System.out.println(taulukkoMerkkijonona(matriisi));
        
    }
    public static String taulukkoMerkkijonona(int[][] taulukko) {
        String m_jono = "";
        for (int rivi = 0; rivi < taulukko.length; rivi++) {
            for (int sarake = 0; sarake < taulukko[rivi].length; sarake++) {
                m_jono = m_jono + String.valueOf(taulukko[rivi][sarake]);
            }
            m_jono = m_jono +  "\n";
       }
            return m_jono;
        }

}
