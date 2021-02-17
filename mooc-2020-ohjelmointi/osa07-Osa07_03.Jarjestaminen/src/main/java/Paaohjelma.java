
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }
    
    public static int pienin(int[] taulukko) {
        int min =taulukko[0];
        for (int i = 0; i < taulukko.length; i++) {
            if (min > taulukko[i]){
                min = taulukko[i];
            }
        }
        return min;
    }
    public static int pienimmanIndeksi(int[] taulukko) {
    // kirjoita koodia tähän
        int indeksi = 0;
        int min = taulukko [0];
        for (int i = 0; i < taulukko.length; i++) {
            if (min > taulukko[i]){
                indeksi = i;
                min = taulukko[i];
            }
        }
        return indeksi;
    }
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
    // kirjoita koodia tähän
        int indeksi = aloitusIndeksi;
        int min = taulukko[aloitusIndeksi];
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (min > taulukko[i]){
                indeksi = i;
                min = taulukko[i];
            }
        }
        return indeksi;
    }
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int temp = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = temp;
    }
    
    public static void jarjesta(int [] taulukko){
        System.out.println(Arrays.toString(taulukko));
        for (int i = 0; i < taulukko.length; i++){
            int pienin = pienin(taulukko);
            int pieninIndeksi = pienimmanIndeksiAlkaen(taulukko, i);
            vaihda(taulukko,i,pieninIndeksi);
            System.out.println(Arrays.toString(taulukko));
        }
    } 
    
}
