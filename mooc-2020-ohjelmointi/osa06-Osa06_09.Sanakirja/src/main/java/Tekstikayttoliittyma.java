import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Sanakirja sanakirja;
    private Scanner lukija;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.sanakirja = sanakirja;
        this.lukija = lukija;
    }
    public void kaynnista(){
        while (true) {
            System.out.print("Komento: ");
            String komento = lukija.nextLine(); 
            if(komento.equals("lopeta")) {
                System.out.println("Hei Hei!");
                break;
            } if (komento.equals("lisaa")) {
                System.out.print("Sana: ");
                String sana = lukija.nextLine();
                System.out.print("Käännös: ");
                String kaannos = lukija.nextLine();
                sanakirja.lisaa(sana, kaannos);
                continue;
            } if (komento.equals("hae")) {
                System.out.print("Haettava: ");
                String haettava = lukija.nextLine();
                if (sanakirja.kaanna(haettava) == null) {
                    System.out.println("Sanaa "+ haettava + " ei löydy");
                } else {
                System.out.print("Käännös: ");
                System.out.println(sanakirja.kaanna(haettava));
                continue;
                }
            } else {
                System.out.println("Tuntematon komento");
            }
        }
    }
}
