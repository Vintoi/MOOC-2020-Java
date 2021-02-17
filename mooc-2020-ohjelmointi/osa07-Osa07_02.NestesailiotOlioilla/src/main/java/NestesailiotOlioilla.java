
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio eka = new Sailio();
        Sailio toka = new Sailio();
        System.out.println("Ensimmäinen: " + eka);
        System.out.println("Toinen: " + toka);
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);
            if (komento.equals("lisaa") && maara >= 0) {
                eka.lisaa(maara);
                System.out.println("Ensimmäinen: " + eka);
                System.out.println("Toinen: " + toka);
            }
            if (komento.equals("siirra")&& maara >= 0) {
                if (eka.sisalto() == 0){
                    System.out.println("Ensimmäinen: " + eka);
                    System.out.println("Toinen: " + toka);
                } else if (eka.sisalto() - maara < 0) {
                    toka.lisaa(eka.sisalto());
                    eka.poista(maara);
                    System.out.println("Ensimmäinen: " + eka);
                    System.out.println("Toinen: " + toka);
                } else {
                eka.poista(maara);
                toka.lisaa(maara);
                System.out.println("Ensimmäinen: " + eka);
                System.out.println("Toinen: " + toka);
                }
            }
            if (komento.equals("poista")&& maara >= 0) {
                toka.poista(maara);
                System.out.println("Ensimmäinen: " + eka);
                System.out.println("Toinen: " + toka);
            }
        }
    }

}
