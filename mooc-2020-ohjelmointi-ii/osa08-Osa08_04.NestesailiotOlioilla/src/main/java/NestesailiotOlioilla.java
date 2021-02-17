
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio yksi = new Sailio();
        Sailio kaksi = new Sailio();
        System.out.println("Ensimmainen: " + yksi);
        System.out.println("Toinen: " + kaksi);
        

        while (true) {
   
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);  
            if (komento.equals("lisaa") && maara >= 0) {
                yksi.lisaa(maara);
                System.out.println("Ensimmainen: " + yksi);
                System.out.println("Toinen: " + kaksi);
            }
            if (komento.equals("siirra")&& maara >= 0) {
                if (yksi.sisalto() < 0){
                    System.out.println("Ensimmainen: " + yksi);
                    System.out.println("Toinen: " + kaksi); 
                } else if (yksi.sisalto() - maara < 0){
                    kaksi.lisaa(yksi.sisalto());
                    yksi.poista(maara);
                    System.out.println("Ensimmainen: " + yksi);
                    System.out.println("Toinen: " + kaksi);  
                } else {
                yksi.poista(maara);
                kaksi.lisaa(maara);
                System.out.println("Ensimmainen: " + yksi);
                System.out.println("Toinen: " + kaksi);  
                }
                
            }
            if (komento.equals("poista")&& maara >= 0) {
                kaksi.poista(maara);
                System.out.println("Ensimmainen: " + yksi);
                System.out.println("Toinen: " + kaksi);        
            }

        }
    }

}
