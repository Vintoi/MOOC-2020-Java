
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int eka = 0;
        int toka = 0;
            System.out.println("Ensimmäinen: " + eka + "/100");
            System.out.println("Toinen: " + toka + "/100");
        while (true) {

            String luettu = lukija.nextLine();
 
            if (luettu.equals("lopeta")) {
                //System.out.println("Ensimmäinen: " + eka + "/100");
                //System.out.println("Toinen: " + toka + "/100");
                break;
            } 
            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);  
            if (komento.equals("lisaa") && maara >= 0) {
                if (eka + maara >= 100){
                    eka = 100;
                    System.out.println("Ensimmäinen: " + eka + "/100");
                    System.out.println("Toinen: " + toka + "/100");
                } else {
                    eka = eka + maara;
                    System.out.println("Ensimmäinen: " + eka + "/100");
                    System.out.println("Toinen: " + toka + "/100");
                } 

            }
            if (komento.equals("siirra")&& maara >= 0) {
                if (eka == 0) {
                    System.out.println("Ensimmäinen: " + eka + "/100");
                    System.out.println("Toinen: " + toka + "/100"); 
                } else if (eka - maara < 0 && toka+maara >100){
                    eka = 0;
                    toka = 100;
                    System.out.println("Ensimmäinen: " + eka + "/100");
                    System.out.println("Toinen: " + toka + "/100");
                } else if(eka - maara < 0) {
                    int siirto = maara - eka;
                        toka = eka;
                        eka = 0;
                        System.out.println("Ensimmäinen: " + eka + "/100");
                        System.out.println("Toinen: " + toka + "/100");
                    
                } else {
                    if (toka + maara > 100) {
                        eka = eka-maara;
                        toka = 100;
                        System.out.println("Ensimmäinen: " + eka + "/100");
                        System.out.println("Toinen: " + toka + "/100");
                    } else {
                    eka = eka - maara;
                    toka = toka + maara;
                    System.out.println("Ensimmäinen: " + eka + "/100");
                    System.out.println("Toinen: " + toka + "/100");
                    }
                }
            }
            if (komento.equals("poista")&& maara >= 0) {
                if (toka == 0) {
                    System.out.println("Ensimmäinen: " + eka + "/100");
                    System.out.println("Toinen: " + toka + "/100");
                } else if (toka - maara < 0) {
                    toka = 0;
                    System.out.println("Ensimmäinen: " + eka + "/100");
                    System.out.println("Toinen: " + toka + "/100");
                } else {
                    toka = toka - maara;
                    System.out.println("Ensimmäinen: " + eka + "/100");
                    System.out.println("Toinen: " + toka + "/100");
                }
            }
        }

    }
}

