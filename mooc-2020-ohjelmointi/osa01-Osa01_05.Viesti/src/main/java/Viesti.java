
import java.util.Scanner;

public class Viesti {

    public static void main(String[] args) {
        String viesti;
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kirjoita merkkijono!");
        // toteuta ohjelma tänne
        viesti = lukija.nextLine();
        System.out.println(viesti);
    }
}
