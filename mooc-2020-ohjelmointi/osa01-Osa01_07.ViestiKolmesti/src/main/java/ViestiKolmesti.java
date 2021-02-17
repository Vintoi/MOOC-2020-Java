
import java.util.Scanner;

public class ViestiKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String viesti;
        System.out.println("Kirjoita merkkijono!");
        // toteuta ohjelma tänne
        viesti = lukija.nextLine();
        
        for (int i = 0; i < 3; i++) {
            System.out.println(viesti);
        }
    }
}
