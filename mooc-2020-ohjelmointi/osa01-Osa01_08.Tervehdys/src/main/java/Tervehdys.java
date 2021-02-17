
import java.util.Scanner;

public class Tervehdys {

    public static void main(String[] args) {
        String nimi;
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Mikä on nimesi?");
        nimi = lukija.nextLine();
        System.out.println("Hei " + nimi);
    }
}
