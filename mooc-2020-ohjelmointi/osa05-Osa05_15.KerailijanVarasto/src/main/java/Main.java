
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Tuote> tuotteet = new ArrayList<>();
            while (true) {
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String tunnus = lukija.nextLine();
            if (tunnus.isEmpty()) {
                break;
            }
            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            Tuote tuote = new Tuote(tunnus, nimi);
            if (tuotteet.contains(tuote)) {
            } else {
                
            tuotteet.add(tuote);
            }
            }
            System.out.println("==Esineet==");
            for (int i = 0; i < tuotteet.size() ; i++) {
                System.out.println(tuotteet.get(i));
            }
    }
}
