
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ika =0;
        int max = 0;
        String pisin = "";
        int lukuja = 0;
        
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            String[] palat = luettu.split(",");
            ika = ika + Integer.valueOf(palat[1]);
            lukuja = lukuja + 1;
            
            if (max < palat[0].length()) {
                max = palat[0].length();
                pisin = palat[0];
                
            }
            
        }
        double ka = 1.0 * ika / lukuja;
        System.out.println("Pisin nimi: " + pisin);
        System.out.println("Syntymävuosien keskiarvo: " + ka);
    }
}