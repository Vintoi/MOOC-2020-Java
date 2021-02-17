
import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String mjono = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double liukuluku =  Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean arvo = Boolean.valueOf(lukija.nextLine());
        System.out.println("Syötit merkkijonon " +mjono + "\n" + "Syötit kokonaisluvun " +luku+ "\n" + "Syötit liukuluvun " + liukuluku + "\n" + "Syötit totuusarvon " +arvo);
    }
}
